package com.infinity.a_zscience;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button chemButton, physicsButton, mathsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chemButton = findViewById(R.id.chem_button);
        physicsButton = findViewById(R.id.phys_button);
        mathsButton = findViewById(R.id.maths_button);
        chemButton.setOnClickListener(v -> {
            Intent intent1 = new Intent(MainActivity.this, chemistry_standard.class);
            startActivity(intent1);
        });
        physicsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, physics_standard.class);
                startActivity(intent2);
            }
        });
        mathsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this, maths_standard.class);
                startActivity(intent3);
            }
        });
    }
}