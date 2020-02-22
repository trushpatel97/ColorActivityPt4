package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
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


public class PaletteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Palette Activity");
        final Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.myColors, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter<CharSequence> stringNames = ArrayAdapter.createFromResource(this,R.array.myStrings, android.R.layout.simple_spinner_item);
        stringNames.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(new ColorAdapter(this));
        final boolean userSelected = false;

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    view.setBackgroundResource(R.color.white);
                }
                else if(position == 1){
                    view.setBackgroundResource(R.color.white);
                    Intent i = new Intent(PaletteActivity.this, CanvasActivity.class);
                    i.putExtra("position",1);
                    PaletteActivity.this.startActivity(i);
                }else if(position == 2){
                    view.setBackgroundResource(R.color.white);
                    Intent i = new Intent(PaletteActivity.this, CanvasActivity.class);
                    i.putExtra("position",2);
                    PaletteActivity.this.startActivity(i);

                }else if(position == 3){
                    view.setBackgroundResource(R.color.white);
                    Intent i = new Intent(PaletteActivity.this, CanvasActivity.class);
                    i.putExtra("position",3);
                    PaletteActivity.this.startActivity(i);

                }else if(position == 4){
                    view.setBackgroundResource(R.color.white);
                    Intent i = new Intent(PaletteActivity.this, CanvasActivity.class);
                    i.putExtra("position",4);
                    PaletteActivity.this.startActivity(i);

                }else if(position == 5){
                    view.setBackgroundResource(R.color.white);
                    Intent i = new Intent(PaletteActivity.this, CanvasActivity.class);
                    i.putExtra("position",5);
                    PaletteActivity.this.startActivity(i);

                }else if(position == 6){
                    view.setBackgroundResource(R.color.white);
                    Intent i = new Intent(PaletteActivity.this, CanvasActivity.class);
                    i.putExtra("position",6);
                    PaletteActivity.this.startActivity(i);

                }else if(position == 7){
                    view.setBackgroundResource(R.color.white);
                    Intent i = new Intent(PaletteActivity.this, CanvasActivity.class);
                    i.putExtra("position",7);
                    PaletteActivity.this.startActivity(i);

                }else if(position == 8){
                    view.setBackgroundResource(R.color.white);
                    Intent i = new Intent(PaletteActivity.this, CanvasActivity.class);
                    i.putExtra("position",8);
                    PaletteActivity.this.startActivity(i);

                }else if(position == 9){
                    view.setBackgroundResource(R.color.violet);
                    Intent i = new Intent(PaletteActivity.this, CanvasActivity.class);
                    i.putExtra("position",9);
                    PaletteActivity.this.startActivity(i);
                }else if(position == 10){
                    view.setBackgroundResource(R.color.white);
                    Intent i = new Intent(PaletteActivity.this, CanvasActivity.class);
                    i.putExtra("position",10);
                    PaletteActivity.this.startActivity(i);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

}
