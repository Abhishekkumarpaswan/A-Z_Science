package com.infinity.a_zscience;

import androidx.annotation.NonNull;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter<String> {
String[] arr;
Context context;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull String[] arr) {
        super(context, resource, arr);
        this.arr = arr;
        this.context = context;
    }

    @NonNull
    @Override
    public String getItem(int position){
        return arr[position];
    }

    @SuppressLint("ViewHolder")
    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent){
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_custom_adapter, parent, false);
        TextView textView =convertView.findViewById(R.id.textView);
        textView.setText(getItem(position));
        return convertView;
    }
}