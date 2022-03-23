package com.example.test1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button m = findViewById(R.id.Next1);
        m.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity3.this,MainActivity4.class);
            startActivity(intent);
        });



    }
}