package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Bundle bundle = getIntent().getExtras();
        if (bundle  != null) {
            String name = bundle.getString("name");
            String age = bundle.getString("age");
            TextView tvName = findViewById(R.id.tvName);
            TextView tvAge = findViewById(R.id.tvAge);
            tvName.setText(name);
            tvAge.setText(age);
        }
    }
}