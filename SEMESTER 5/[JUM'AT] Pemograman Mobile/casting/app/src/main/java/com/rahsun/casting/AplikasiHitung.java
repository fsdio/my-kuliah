package com.rahsun.casting;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AplikasiHitung extends AppCompatActivity implements InterfaceAplikasi {

  int panjang, lebar, tinggi;

  EditText epanjang, elebar, etinggi;
  TextView hasil;
  Button run, clear;

  public void Inisial() {

    epanjang = findViewById(R.id.panjang);
    elebar = findViewById(R.id.lbr);
    etinggi = findViewById(R.id.tinggi);

    hasil = findViewById(R.id.id_volume);

    run = (Button) findViewById(R.id.brun);
    clear = (Button) findViewById(R.id.bclear);

  }


  @Override
  public int Hitungluas() {
    Inisial();
    panjang = Integer.parseInt(epanjang.getText().toString());
    lebar = Integer.parseInt(elebar.getText().toString());
    int luas = panjang * lebar;
    return luas;
  }

  @Override
  public double Hitungvolume() {
    Inisial();
    tinggi = Integer.parseInt(etinggi.getText().toString());
    double doubleVolume = Hitungluas() * tinggi;
    return doubleVolume;
  }

  public void clear(){
    Inisial();
    clear.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        hasil.setText("");
        epanjang.setText("");
        elebar.setText("");
        etinggi.setText("");
      }
    });
  }

  public void run(){
    Inisial();
    run.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        String Hasilvolume = Double.toString(Hitungvolume());
        hasil.setText(Hasilvolume);
      }
    });
  }

}
