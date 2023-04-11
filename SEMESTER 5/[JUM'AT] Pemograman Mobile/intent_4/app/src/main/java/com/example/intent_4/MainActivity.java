package com.example.intent_4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  // deklarasikan variabel yang mau digunakan
  Button link_explicit, link_implicit;
  @SuppressLint("MissingInflatedId")
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    // mau relasikan antara xml dan java
    link_explicit = findViewById(R.id.explicit);
    link_implicit = findViewById(R.id.implicit);

    // Jalankan Button Dengan Proses Click
    link_explicit.setOnClickListener(this);
    link_implicit.setOnClickListener(this);
  }

  @Override
  public void onClick(View view) {
    switch (view.getId()){
      case R.id.explicit:
        Intent explicit = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(explicit);
        break;
      case R.id.implicit:
        Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
        startActivity(implicit);
        break;
      default:
        break;
    }
  }
}