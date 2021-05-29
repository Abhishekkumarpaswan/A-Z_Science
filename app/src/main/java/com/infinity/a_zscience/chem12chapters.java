package com.infinity.a_zscience;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class chem12chapters extends AppCompatActivity {
    ListView listView;
    String[] chapters = {"Organic reactions", "Problems based on Chemical Structure", "Numerical Problems", "1. Solid State", "2. Solutions", "3. Electrochemistry", "4. Chemical Kinetics", "5. Surface Chemistry",
    "6. General Principles and Processes of Isolation of Elements", "7. p-Block Elements", "8. d-And f-Block Elements", "9. Coordination Compounds",
    "10. Haloalkanes and Haloarenes", "11. Alcohols, Phenols and Ethers", "12. Aldehydes, Ketones and Caboxylic Acids", "13. Organic Compounds Containing Nitrogen",
    "14. Biomolecules", "15. Polymers", "16. Chemistry in Everyday Life"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chem12chapters);
        listView = findViewById(R.id.listView);
        CustomAdapter ad = new CustomAdapter(this, R.layout.activity_chem12chapters, chapters);
        listView.setAdapter(ad);
    }
}