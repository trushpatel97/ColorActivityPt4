package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;


public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final View newBackground;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.myColors, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter<CharSequence> stringNames = ArrayAdapter.createFromResource(this,R.array.myStrings, android.R.layout.simple_spinner_item);
        stringNames.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(new ColorAdapter(this));
        newBackground = this.getWindow().getDecorView();


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ArrayList<Integer> colors;
                colors = new ArrayList<Integer>();
                int retrieve []= getResources().getIntArray(R.array.myColors);
                for(int i:retrieve)
                {
                    colors.add(i);
                }
                view.setBackgroundResource(R.color.silver);
                TextView selectedColor = findViewById(R.id.colorsName);
                if(position == 0){
                    view.setBackgroundResource(R.color.white);
                    newBackground.setBackgroundResource(R.color.silver);
                    selectedColor.setText("Current color: Silver");
                }else if(position == 1){
                    view.setBackgroundResource(R.color.white);
                    newBackground.setBackgroundResource(R.color.pink);
                    selectedColor.setText("Current color: Pink");
                }else if(position == 2){
                    view.setBackgroundResource(R.color.white);
                    newBackground.setBackgroundResource(R.color.red);
                    selectedColor.setText("Current color: Red");
                }else if(position == 3){
                    view.setBackgroundResource(R.color.white);
                    newBackground.setBackgroundResource(R.color.orange);
                    selectedColor.setText("Current color: Orange");
                }else if(position == 4){
                    view.setBackgroundResource(R.color.white);
                    newBackground.setBackgroundResource(R.color.yellow);
                    selectedColor.setText("Current color: Yellow");
                }else if(position == 5){
                    view.setBackgroundResource(R.color.white);
                    newBackground.setBackgroundResource(R.color.green);
                    selectedColor.setText("Current color: Green");
                }else if(position == 6){
                    view.setBackgroundResource(R.color.white);
                    newBackground.setBackgroundResource(R.color.blue);
                    selectedColor.setText("Current color: Blue");
                }else if(position == 7){
                    view.setBackgroundResource(R.color.white);
                    newBackground.setBackgroundResource(R.color.indigo);
                    selectedColor.setText("Current color: Indigo");
                }else if(position == 8){
                    view.setBackgroundResource(R.color.white);
                    newBackground.setBackgroundResource(R.color.violet);
                    selectedColor.setText("Current color: Violet");
                }else if(position == 9){
                    view.setBackgroundResource(R.color.white);
                    newBackground.setBackgroundResource(R.color.brown);
                    selectedColor.setText("Current color: Brown");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }

}
