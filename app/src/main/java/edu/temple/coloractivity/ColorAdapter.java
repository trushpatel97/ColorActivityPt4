package edu.temple.coloractivity;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorAdapter extends BaseAdapter {
    ArrayList<Integer> colors;
    Context context;

    public ColorAdapter(Context context){

        this.context=context;
        colors = new ArrayList<Integer>();
        int retrieve []=context.getResources().getIntArray(R.array.myColors);
        for(int i:retrieve)
        {
            colors.add(i);
        }
    }
    @Override
    public int getCount() {
        return colors.size();
    }

    @Override
    public Object getItem(int args) {
        return colors.get(args);
    }

    @Override
    public long getItemId(int args) {
        return args;
    }

    public String getElementFromColors(int position){
        String retrieve []=context.getResources().getStringArray(R.array.myColors);
        return retrieve[position];
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=LayoutInflater.from(context);
        convertView=inflater.inflate(android.R.layout.simple_spinner_dropdown_item, null);
        TextView txv=(TextView)convertView.findViewById(android.R.id.text1);
        txv.setBackgroundColor(colors.get(position));
        txv.setText(getElementFromColors(position));
        return convertView;
    }

}