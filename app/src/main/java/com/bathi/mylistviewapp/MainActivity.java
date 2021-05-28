package com.bathi.mylistviewapp;

/**
 * Author: Bathi Ntshinga
 * Group: Part-Time
 * Stud_Nr: 214198227
 * Due Date: 31 May 2021
 */

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    ListView lvIcons;
    String[] proNames = {"PowerOff/On", "Playback", "Pause",
            "Backward", "FastForward",
            "Record", "Previous", "Next", "Stop"};
    String[] proDescription = {"PowerOff/On Description", "Playback Description",
            "Pause Description", "Backward Description", "FastForward Description",
            "Record Description", "Previous Description", "Next", "StopDescription"};
    int[] iconImages = {R.drawable.power,
             R.drawable.play,
             R.drawable.pause,
             R.drawable.backward,
             R.drawable.foward,
             R.drawable.rec,
             R.drawable.previous,
             R.drawable.next,
             R.drawable.stop,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvIcons = findViewById(R.id.lvIcons);
        IconsAdapter iconsAdapter = new IconsAdapter(this, proNames, iconImages, proDescription);
        lvIcons.setAdapter(iconsAdapter);
    }

}

