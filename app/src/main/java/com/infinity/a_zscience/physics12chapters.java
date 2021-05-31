package com.infinity.a_zscience;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class physics12chapters extends AppCompatActivity {
    ListView listView;
    String[] chapters = {" Important Laws", " Important Equations" , " Important Constants" , " 1. Electrostatics" , " 2. Current Electricity" , " 3. Magnetic Effects of Current and Magnetism"
                         , " 4. Electromagnetic Induction and Alternating Currents" , " 5. Electromagnetic Waves" , " 6. Optics" , " 7. Dual Nature of Radiation and Matter" , " 8. Atom and Nuclei"
                         , " 9. Electronic Devices"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics12chapters);
        listView = findViewById(R.id.listView);
        CustomAdapter ad = new CustomAdapter(this, R.layout.activity_physics12chapters, chapters);
        listView.setAdapter(ad);
    }
}
