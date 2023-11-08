package com.example.web45p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.web45p1.R;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        Button buttonActB = findViewById(R.id.opActivityB);

        buttonActB.setOnClickListener(view -> {
            Intent intent = new Intent(ActivityA.this, ActivityB.class);
            startActivity(intent);
        });

    }
}