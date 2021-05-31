package com.infinity.a_zscience;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class maths12chapters extends AppCompatActivity {
    ListView listView;
    String[] chapters = {};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths12chapters);
        listView = findViewById(R.id.listView);
        CustomAdapter ad = new CustomAdapter(this, R.layout.activity_maths12chapters, chapters);
        listView.setAdapter(ad);
    }
}