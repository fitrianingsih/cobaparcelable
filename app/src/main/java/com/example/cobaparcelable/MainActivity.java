package com.example.cobaparcelable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
EditText nama, kelas;
Button proses, backmain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nama = (EditText) findViewById(R.id.enama);
        kelas = (EditText) findViewById(R.id.ekelas);
        proses = (Button) findViewById(R.id.submit_button);
        backmain = (Button) findViewById(R.id.btnbackparcel);

        backmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahback = new Intent(MainActivity.this,halaman_utama.class);
                startActivity(pindahback);
                MainActivity.this.finish();
            }
        });

        proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //pindah
                Intent pindah = new Intent(MainActivity.this,halaman2.class);
//                MainActivity.this.finish(); salah, kalo gini yg ada aplikasi nya end/close
                //kirim data
                pindah.putExtra("nama", nama.getText().toString());
                pindah.putExtra("kelas", kelas.getText().toString());
                startActivity(pindah);
                MainActivity.this.finish();
                //alert

                //alert2

            }
        });
    }
}