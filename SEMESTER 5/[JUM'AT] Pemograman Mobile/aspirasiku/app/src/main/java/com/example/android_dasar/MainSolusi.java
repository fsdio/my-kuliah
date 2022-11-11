package com.example.android_dasar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainSolusi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView t1 = findViewById(R.id.text_1);
        ImageView g1 = findViewById(R.id.img_1);

        Button amin = (Button) findViewById(R.id.amin);
        amin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                t1.setText("AMIN");
                g1.setImageResource(R.drawable.amin);

            }
        });

        Button joko = (Button) findViewById(R.id.joko);
        joko.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                t1.setText("JOKOWI");
                g1.setImageResource(R.drawable.joko);

            }
        });
    }
}