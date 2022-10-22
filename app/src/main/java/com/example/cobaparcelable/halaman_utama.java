package com.example.cobaparcelable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class halaman_utama extends AppCompatActivity {
Button parcel, check, keluar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_utama);
        check = (Button) findViewById(R.id.btncheck);
        parcel = (Button) findViewById(R.id.btnparcel);
        keluar = (Button) findViewById(R.id.btnkeluar);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahcek = new Intent(halaman_utama.this,coba_checkbox.class);
                startActivity(pindahcek);
                halaman_utama.this.finish();
            }
        });

        parcel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahparcel = new Intent(halaman_utama.this,MainActivity.class);
                startActivity(pindahparcel);
                halaman_utama.this.finish();
            }
        });

        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                halaman_utama.this.finish();
            }
        });
    }
}