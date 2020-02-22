package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        TextView text = findViewById(R.id.newColor);

        final View newBackground;
        newBackground = this.getWindow().getDecorView();



        Intent i = getIntent();
        int pos = i.getIntExtra("position",0);


                if(pos == 1){
                    newBackground.setBackgroundResource(R.color.silver);
                    text.setText("Silver");
                }else if(pos == 2){
                    newBackground.setBackgroundResource(R.color.pink);
                    text.setText("Pink");
                }else if(pos == 3){
                    newBackground.setBackgroundResource(R.color.red);
                    text.setText("Red");
                }else if(pos == 4){
                    newBackground.setBackgroundResource(R.color.orange);
                    text.setText("Orange");
                }else if(pos == 5){
                    newBackground.setBackgroundResource(R.color.yellow);
                    text.setText("Yellow");
                }else if(pos == 6){
                    newBackground.setBackgroundResource(R.color.green);
                    text.setText("Green");
                }else if(pos == 7){
                    newBackground.setBackgroundResource(R.color.blue);
                    text.setText("Blue");
                }else if(pos == 8){
                    newBackground.setBackgroundResource(R.color.indigo);
                    text.setText("Indigo");
                }else if(pos == 9){
                    newBackground.setBackgroundResource(R.color.violet);
                    text.setText("Violet");
                }else if(pos == 10){
                    newBackground.setBackgroundResource(R.color.brown);
                    text.setText("Brown");
                }
            }

}
