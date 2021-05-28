package com.bathi.mylistviewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class IconsAdapter extends ArrayAdapter<String> {

    Context context;
    int []icons;
    String[] proNames;
    String[] proDescription;

    public IconsAdapter(Context context, String [] proNames, int[] icons, String[] proDescription) {
        super(context, R.layout.single_item, R.id.textView1, proNames);
        this.context= context;
        this.icons= icons;
        this.proNames = proNames;
        this.proDescription=proDescription;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View singleItem = convertView;
        ProViewHolder holder = null;
        if(singleItem == null){
            LayoutInflater layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            singleItem= layoutInflater.inflate(R.layout.single_item, parent , false);
            holder = new ProViewHolder(singleItem);
            singleItem.setTag(holder);
        }
        else{
            holder = (ProViewHolder) singleItem.getTag();
        }

        holder.proImageView.setImageResource(icons[position]);
        holder.proTitle.setText(proNames[position]);
        holder.proDescription.setText(proDescription[position]);
        singleItem.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Toast.makeText(getContext(),"U clicked on:" + proNames[position], Toast.LENGTH_SHORT).show();
            }
        });
        return super.getView(position, convertView, parent);
    }
}
