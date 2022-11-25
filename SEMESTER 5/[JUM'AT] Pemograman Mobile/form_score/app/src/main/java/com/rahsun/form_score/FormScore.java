package com.rahsun.form_score;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FormScore extends AppCompatActivity implements FormScoreInterface {

  TextView editt_txt1, vieww_txt1, editt_txt2, vieww_txt2;
  Button btnn_savee1, btnn_clear1, btnn_save2, btnn_clear2;

  public void inisialisasi(){
    editt_txt1 = findViewById(R.id.edit_txt1);
    vieww_txt1 = findViewById(R.id.hasil_txt1);
    editt_txt2 = findViewById(R.id.edit_txt2);
    vieww_txt2 = findViewById(R.id.hasil_txt2);

    btnn_savee1 = findViewById(R.id.btn_save1);
    btnn_clear1 = findViewById(R.id.btn_clear1);

    btnn_save2 = findViewById(R.id.btn_save2);
    btnn_clear2 = findViewById(R.id.btn_clear2);
  }

  @Override
  public void save() {

    Button btn1 = (Button) findViewById(R.id.btn_save1);
    btn1.setOnClickListener(new View.OnClickListener() {
      public void onClick(View v) {

        String add = String.valueOf(editt_txt1.getText());
        vieww_txt1.setText(add);
      }
    });

    Button btn2 = (Button) findViewById(R.id.btn_save2);
    btn2.setOnClickListener(new View.OnClickListener() {
      public void onClick(View v) {
        String add = String.valueOf(editt_txt2.getText());
        vieww_txt2.setText(add);
      }
    });
  }

  @Override
  public void clear() {
    inisialisasi();
    Button btn3 = (Button) findViewById(R.id.btn_clear1);
    btn3.setOnClickListener(new View.OnClickListener() {
      public void onClick(View v) {

        vieww_txt1.setText("");
        editt_txt1.setText("");
      }
    });

    Button btn4 = (Button) findViewById(R.id.btn_clear2);
    btn4.setOnClickListener(new View.OnClickListener() {
      public void onClick(View v) {


        vieww_txt2.setText("");
        editt_txt2.setText("");
      }
    });

  }
}
