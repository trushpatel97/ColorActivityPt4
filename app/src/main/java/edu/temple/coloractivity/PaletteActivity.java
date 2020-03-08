package edu.temple.coloractivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Locale;

import edu.temple.coloractivity.CanvasActivity;
import edu.temple.coloractivity.ColorAdapter;
import edu.temple.coloractivity.R;


public class PaletteActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String CurrentLang = Locale.getDefault().getLanguage();
        if(CurrentLang.equals("es")) {
            setTitle("Actividad de paleta");
        }else{
            setTitle("Palette Activity ");
        }
        final Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.myColors, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter<CharSequence> stringNames = ArrayAdapter.createFromResource(this, R.array.myStrings, android.R.layout.simple_spinner_item);
        stringNames.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        if(CurrentLang.equals("es")){
            ArrayAdapter<CharSequence> stringName = ArrayAdapter.createFromResource(this,R.array.myStrings, android.R.layout.simple_spinner_item);
            stringName.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        }else{
            ArrayAdapter<CharSequence> stringName = ArrayAdapter.createFromResource(this,R.array.myStrings, android.R.layout.simple_spinner_item);
            stringName.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        }


        spinner.setAdapter(new ColorAdapter(this));
        final boolean userSelected = false;

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                }
                else if(position == 1){
                    Intent i = new Intent(PaletteActivity.this, CanvasActivity.class);
                    i.putExtra("position",1);
                    PaletteActivity.this.startActivity(i);
                }else if(position == 2){
                    Intent i = new Intent(PaletteActivity.this, CanvasActivity.class);
                    i.putExtra("position",2);
                    PaletteActivity.this.startActivity(i);
                }else if(position == 3){
                    Intent i = new Intent(PaletteActivity.this, CanvasActivity.class);
                    i.putExtra("position",3);
                    PaletteActivity.this.startActivity(i);
                }else if(position == 4){
                    Intent i = new Intent(PaletteActivity.this, CanvasActivity.class);
                    i.putExtra("position",4);
                    PaletteActivity.this.startActivity(i);
                }else if(position == 5){
                    Intent i = new Intent(PaletteActivity.this, CanvasActivity.class);
                    i.putExtra("position",5);
                    PaletteActivity.this.startActivity(i);
                }else if(position == 6){
                    Intent i = new Intent(PaletteActivity.this, CanvasActivity.class);
                    i.putExtra("position",6);
                    PaletteActivity.this.startActivity(i);
                }else if(position == 7){
                    Intent i = new Intent(PaletteActivity.this, CanvasActivity.class);
                    i.putExtra("position",7);
                    PaletteActivity.this.startActivity(i);
                }else if(position == 8){
                    Intent i = new Intent(PaletteActivity.this, CanvasActivity.class);
                    i.putExtra("position",8);
                    PaletteActivity.this.startActivity(i);
                }else if(position == 9){
                    Intent i = new Intent(PaletteActivity.this, CanvasActivity.class);
                    i.putExtra("position",9);
                    PaletteActivity.this.startActivity(i);
                }else if(position == 10){
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