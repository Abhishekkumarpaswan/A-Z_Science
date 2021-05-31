package com.infinity.a_zscience;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class chemistry_standard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard);
        Button class12_button = findViewById(R.id.standard12_button);
        Button class11_button = findViewById(R.id.standard11_button);
        class12_button.setOnClickListener(v -> {
            Intent intent1 = new Intent(chemistry_standard.this, chem12chapters.class);
            startActivity(intent1);
        });
        class11_button.setOnClickListener(v -> {
            Intent intent2 = new Intent(chemistry_standard.this, chem11chapters.class);
            startActivity(intent2);
        });
    }
}