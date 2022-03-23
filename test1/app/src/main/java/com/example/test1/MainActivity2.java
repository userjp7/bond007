package com.example.test1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button n = findViewById(R.id.Next);
                n.setOnClickListener(view -> {
                    Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                    startActivity(intent);
                });

    }
}