package com.example.days3;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilan_menux);
    }

    public void ClickRS(View view) {
        //gambar RS di click
        Intent i = new android.content.Intent(this,RS.class);
        startActivity (i);
    }
}