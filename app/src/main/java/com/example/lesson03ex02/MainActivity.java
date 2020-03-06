package com.example.lesson03ex02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int correct;
    int time;
    int amount;
    int i;
    int j;
    Boolean bo;
    Button randomBtn;
    Button clearBtn;
    Button smaller;
    Button equal;
    Button bigger;
    TextView counter;
    TextView bool;
    TextView number1;
    TextView number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i=j=time=amount=correct=0;
        bo = false;
        randomBtn = findViewById(R.id.randomBtn);
        clearBtn = findViewById(R.id.clearBtn);
        smaller = findViewById(R.id.smaller);
        equal = findViewById(R.id.equal);
        bigger = findViewById(R.id.bigger);
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
        i=j=time=amount=correct=0;
        bo = false;
    }

    public void randomNums(View view) {
        i = (int) (Math.random()*100)+1;
        j = (int) (Math.random()*100)+1;
        number1.setText(String.valueOf(i));
        number2.setText(String.valueOf(j));
        time = 0;
        bo = true;
    }

    public void checkSmaller(View view) {
        if(i<j && time==0 && bo){
            bool.setText(R.string.True);
            correct ++;
            amount ++;
            counter.setText(String.valueOf(correct)+getString(R.string.div)+String.valueOf(amount));
            time ++;
        }
        else if (i<j && bo){
            bool.setText(R.string.True);
            time ++;
            amount ++;
            counter.setText(String.valueOf(correct)+getString(R.string.div)+String.valueOf(amount));
        }
        else if(i>j && bo){
            bool.setText(R.string.False);
            time ++;
            amount ++;
            counter.setText(String.valueOf(correct)+getString(R.string.div)+String.valueOf(amount));
        }
    }

    public void checkEqual(View view) {
        if(i==j && time==0 && bo){
            bool.setText(R.string.True);
            correct ++;
            amount ++;
            counter.setText(String.valueOf(correct)+getString(R.string.div)+String.valueOf(amount));
            time ++;
        }
        else if (i==j && bo){
            bool.setText(R.string.True);
            amount ++;
            counter.setText(String.valueOf(correct)+getString(R.string.div)+String.valueOf(amount));
            time ++;
        }
        else if (i!=j && bo){
            bool.setText(R.string.False);
            time ++;
            amount ++;
            counter.setText(String.valueOf(correct)+getString(R.string.div)+String.valueOf(amount));
        }
    }

    public void checkBigger(View view) {
        if(i>j && time==0 && bo){
            bool.setText(R.string.True);
            correct ++;
            amount ++;
            counter.setText(String.valueOf(correct)+getString(R.string.div)+String.valueOf(amount));
            time ++;
        }
        else if (i>j && bo){
            bool.setText(R.string.True);
            amount ++;
            counter.setText(String.valueOf(correct)+getString(R.string.div)+String.valueOf(amount));
            time ++;
        }
        else if(i<j && bo){
            bool.setText(R.string.False);
            time ++;
            amount ++;
            counter.setText(String.valueOf(correct)+getString(R.string.div)+String.valueOf(amount));
        }
    }
}


