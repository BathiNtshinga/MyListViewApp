package com.bathi.mylistviewapp;

/**
 * Author: Bathi Ntshinga
 * Group: Part-Time
 * Stud_Nr: 214198227
 */

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int [] proImages = {R.drawable.power,
            R.drawable.play,
            R.drawable.pause,
            R.drawable.backward,
            R.drawable.foward,
            R.drawable.rec,
            R.drawable.previous,
            R.drawable.next,
            R.drawable.stop,};

    String [] proNames = {"PowerOff/On", "Playback", "Pause",
            "Backward", "FastForward",
            "Record", "Previous", "Next", "Stop"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView)findViewById(R.id.listView);
        CustomAdapter customAdapter= new CustomAdapter();
        listView.setAdapter(customAdapter);
    }

    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return proImages.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.customlayout,null);
            ImageView imageView = (ImageView)view.findViewById(R.id.imageView);
            TextView textView_name = (TextView)view.findViewById(R.id.textView_name);

            imageView.setImageResource(proImages[i]);
            textView_name.setText(proNames[i]);
            return view;
        }
    }

}