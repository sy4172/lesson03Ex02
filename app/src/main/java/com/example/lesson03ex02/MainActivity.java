package com.example.lesson03ex02;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int n1, n2;
    float correct, amount;
    Boolean firstClick;
    String percentage;
    TextView counter, bool, number1, number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = n2 = 0;
        amount = correct = 0;
        firstClick = false;
        percentage = "%";
        counter = findViewById(R.id.counter);
        bool = findViewById(R.id.bool);
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
    }


    public void clearAll(View view) {
        number1.setText(R.string.number1);
        number2.setText(R.string.number2);
        counter.setText(R.string.Counter);
        bool.setText(R.string.condition);
        n1 = n2 = 0;
        amount = correct = 0;
        firstClick = false;
    }

    public void randomNums(View view) {
        n1 = (int) (Math.random() * 100) + 1;
        n2 = (int) (Math.random() * 100) + 1;
        number1.setText(String.valueOf(n1));
        number2.setText(String.valueOf(n2));
        firstClick = true;
    }

    public void checkSmaller(View view) {
        if (firstClick) {
             if (n1 < n2) {
                amount++;
                correct++;
                bool.setText(R.string.True);
                 counter.setText(((correct / amount) * 100) + percentage);
                firstClick = false;
            }
            else{
                amount++;
                bool.setText(R.string.False);
                 counter.setText(((correct / amount) * 100) + percentage);
                firstClick = false;
            }
        }
    }

    public void checkEqual(View view) {
        if (firstClick) {
            if (n1 == n2) {
                amount++;
                correct++;
                bool.setText(R.string.True);
                counter.setText(((correct / amount) * 100) + percentage);
                firstClick = false;
            }
            else{
                amount++;
                bool.setText(R.string.False);
                counter.setText(((correct / amount) * 100) + percentage);
                firstClick = false;
            }
        }
    }

    public void checkBigger(View view) {
        if (firstClick) {
            if (n1 > n2) {
                amount++;
                correct++;
                bool.setText(R.string.True);
                counter.setText(((correct / amount) * 100) + percentage);
                firstClick = false;
            }
            else{
                amount++;
                bool.setText(R.string.False);
                counter.setText(((correct / amount) * 100) + percentage);
                firstClick = false;
            }
        }
    }
}