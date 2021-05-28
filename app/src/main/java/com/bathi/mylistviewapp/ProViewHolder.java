package com.bathi.mylistviewapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ProViewHolder {

    ImageView proImageView;
    TextView proTitle;
    TextView proDescription;
    ProViewHolder(View v)
    {
        proImageView= v.findViewById(R.id.imageView);
        proTitle = v.findViewById(R.id.textView1);
        proDescription= v.findViewById(R.id.textView2);
    }

}