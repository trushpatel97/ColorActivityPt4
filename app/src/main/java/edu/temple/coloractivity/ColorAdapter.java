package edu.temple.coloractivity;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class ColorAdapter extends BaseAdapter {
    ArrayList<DataHolder> arrayList;
    public CustomAdapter(Context context, ArrayList<DataHolder> arrayList){
        this.context = context;
        this.arrayList = arrayList;
    }
    @Override
    public int getCount() {
        return 0;
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
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }

    public View getDropDownView(int position, View convertView, ViewGroup parent){
        return super.getDropDownView(position,convertView,parent);
    }
}
