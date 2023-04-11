package com.rahsun.tokobakso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  // Declarasi Variabel
  TextView hargamieayam, hargamieceker, totalharga;
  EditText jumlahporsiayam, jumlahporsiceker;
  ImageButton bAyamBakso, bAyamCeker;
  Button pembayaran;
  String sMieAyam, sMieCeker;
  int intMieAyam, intMieCeker;
  int porsiAyam, porsiCeker;
  int hargatotalmieayam, hargatotalmieceker;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    bAyamBakso = findViewById(R.id.img1);
    bAyamCeker = findViewById(R.id.img2);
    hargamieayam = findViewById(R.id.txt8);
    hargamieceker = findViewById(R.id.txt10);
    jumlahporsiayam = findViewById(R.id.edt1);
    jumlahporsiceker = findViewById(R.id.edt2);

    pembayaran = findViewById(R.id.btn1);
    totalharga = findViewById(R.id.txt11);

    bAyamBakso.setOnClickListener(new View.OnClickListener(){
      @Override
      public void onClick(View view) {
        hargamieayam.setText("20000");
        sMieAyam = hargamieayam.getText().toString();
        intMieAyam = Integer.parseInt(sMieAyam);
      }
    });

    bAyamCeker.setOnClickListener(new View.OnClickListener(){
      @Override
      public void onClick(View view) {
        hargamieceker.setText("25000");
        sMieCeker = hargamieceker.getText().toString();
        intMieCeker = Integer.parseInt(sMieCeker);
      }
    });

    pembayaran.setOnClickListener(new View.OnClickListener(){
      @Override
      public void onClick(View view) {
        HitungHarga hargaTotal = new HitungHarga();
        porsiAyam = Integer.parseInt(String.valueOf(jumlahporsiayam.getText()));
        porsiCeker = Integer.parseInt(String.valueOf(jumlahporsiceker.getText()));

        hargatotalmieayam = intMieAyam*porsiAyam;
        hargatotalmieceker = intMieCeker*porsiCeker;

        int pembayaran = hargaTotal.hitung(hargatotalmieayam, hargatotalmieceker);
        totalharga.setText("RP. " + String.valueOf(pembayaran) + ",-");
      }
    });
  }
}