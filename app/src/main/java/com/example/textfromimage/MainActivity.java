package com.example.textfromimage;


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



    public void second(View view ){

        Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
        startActivity(intent);

    }
}