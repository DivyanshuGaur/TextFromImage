package com.example.textfromimage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tv=(TextView)findViewById(R.id.textView);


        Intent intent=  getIntent();
        String s=intent.getStringExtra("detecttext");
        tv.setText(s);



    }
}
