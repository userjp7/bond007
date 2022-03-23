package com.example.test1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5 extends AppCompatActivity {
    EditText n, d ;



    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n = findViewById(R.id.name);
        d = findViewById(R.id.dob);
        Button button = findViewById(R.id.enter);
        button.setOnClickListener(v -> {
            String name = n.getText().toString().trim();
            String dob = d.getText().toString().trim();
            Bundle bundle = new Bundle();
            bundle.putString("name", name);
            bundle.putString("dob", dob);
            Intent intent = new Intent(MainActivity5.this, MainActivity6.class);
            intent.putExtras(bundle);
            startActivity(intent);
        });
    }
}