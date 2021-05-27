package com.bathi.mylistviewapp;

/**
 * Author: Bathi Ntshinga
 * Group: Part-Time
 * Stud_Nr: 214198227
 * Due Date: 31 May 2021
 * Description: Displaying and Viewing Images
 */

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class ListViewImage extends AppCompatActivity {
    ListView lv;
    Context context;

    public static int[] proImages ={
            R.drawable.power, R.drawable.play, R.drawable.pause,
            R.drawable.backward, R.drawable.foward, R.drawable.rec,
            R.drawable.previous, R.drawable.next, R.drawable.stop
    };

    public static String [] proNames ={
            "PowerOff/On","Playback","Pause","Backward","FastForward","Record","Previous","Next","Stop"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_image);

        MyListAdapter adapter = new MyListAdapter(this, proNames, proImages);
        lv = (ListView) findViewById(R.id.listView2);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override

            public void onItemClick( AdapterView parent, View view, int position, long id){
                Toast.makeText(ListViewImage.this, "U clicked on:" + proNames[position], Toast.LENGTH_SHORT).show();
            }
        });
    }

}
