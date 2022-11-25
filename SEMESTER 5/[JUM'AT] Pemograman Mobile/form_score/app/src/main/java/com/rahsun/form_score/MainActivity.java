package com.rahsun.form_score;

import android.os.Bundle;

public class MainActivity extends FormScore implements FormScoreInterface{

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.coba);

    inisialisasi();
    save();
    clear();

  }
}