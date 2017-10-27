package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button_test(View v){
        Intent Act = new Intent(getApplicationContext(),test.class);
        startActivity(Act);
    }
    public void button_test2(View v){
        Intent Act = new Intent(getApplicationContext(),fuckin_test.class);
        startActivity(Act);
    }
}
