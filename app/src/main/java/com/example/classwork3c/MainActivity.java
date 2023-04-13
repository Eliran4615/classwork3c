package com.example.classwork3c;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        sum = 0;
    }

    public void GO(View view) {
        sum++;
        if(sum != 6)
            btn.setText("This is a click number:"+ sum);
        else {
            btn.setText("enough to click. go to new start!");
            sum = 0; 
        }
    }
}