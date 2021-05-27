package com.bathi.mylistviewapp;

/**
 * Author: Bathi Ntshinga
 * Group: Part-Time
 * Student number: 214198227
 * Class Description: Custom Adapter
 */
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;

import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;



public class MyListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String [] proNames;
    private final int[] proIcons;


    public MyListAdapter(Activity context, String[] proNames, int[] proIcons) {
        super(context,R.layout.activity_image_list, proNames);
        this.context = context;
        this.proNames = proNames;
        this.proIcons = proIcons;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.activity_image_list, null, true);
        TextView textView = (TextView) rowView.findViewById(R.id. textView2);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView1);
        textView.setText(proNames[position]);
        imageView.setImageResource(proIcons[position]);
        return rowView;
    };

}

