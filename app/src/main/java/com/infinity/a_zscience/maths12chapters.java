package com.infinity.a_zscience;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class maths12chapters extends AppCompatActivity {
    ListView listView;
    String[] chapters = {"Trigonometric Formulas", "Inverse Trigonometric Formulas", "Differentiation Formulas", "Integration Formulas", "1. Relations and Functions", "2. Matrices", "3. Determinants", "4. Differentiation", "5. Application of Derivatives",
    "6. Integrals", "7. Differential Equations", "8. Probability", "9. Vectors",
    "10. Three - dimennsional Geometry", "11. Application of Integrals", "12. Application of Calculus", "13. Linear Regression",
    "14. Linear Programming"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths12chapters);
        listView = findViewById(R.id.listView);
        CustomAdapter ad = new CustomAdapter(this, R.layout.activity_maths12chapters, chapters);
        listView.setAdapter(ad);
    }
}
