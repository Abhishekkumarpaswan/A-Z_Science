package com.infinity.a_zscience;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class maths_standard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard);
        Button class12_button = findViewById(R.id.standard12_button);
        Button class11_button = findViewById(R.id.standard11_button);
        class12_button.setOnClickListener(v -> {
            Intent intent1 = new Intent(maths_standard.this, maths12chapters.class);
            startActivity(intent1);
        });
        class11_button.setOnClickListener(v -> {
            Intent intent2 = new Intent(maths_standard.this, maths11chapters.class);
            startActivity(intent2);
        });
    }
}