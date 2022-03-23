package com.example.test1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button o = findViewById(R.id.Next2);
        o.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity4.this,MainActivity5.class);
                    startActivity(intent);
        });

    }
}