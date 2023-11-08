package com.example.web45p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.web45p1.R;

public class ActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        Button btActAfromC = findViewById(R.id.opActivityA_fromC);
        btActAfromC.setOnClickListener(view -> {
            Intent intent = new Intent(ActivityC.this, ActivityA.class);
            startActivity(intent);
        });

        Button btActDfromC = findViewById(R.id.opActivityD_fromC);
        btActAfromC.setOnClickListener(view -> {
            Intent intent = new Intent(ActivityC.this, ActivityD.class);
            finishAffinity();
            startActivity(intent);
        });

        Button btActC = findViewById(R.id.clActivityC);
        btActAfromC.setOnClickListener(view -> {
            Intent intent = new Intent(ActivityC.this, ActivityB.class);
            startActivity(intent);
        });

        Button btAclStack = findViewById(R.id.Close_stack);
        btActAfromC.setOnClickListener(view -> finishAffinity());
    }


}