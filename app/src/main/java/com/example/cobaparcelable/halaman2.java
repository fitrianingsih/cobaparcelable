package com.example.cobaparcelable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class halaman2 extends AppCompatActivity {
    TextView nama, kelas;
    Button finish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);
        nama = (TextView) findViewById(R.id.hnama);
        kelas = (TextView) findViewById(R.id.hkelas);
        finish = (Button) findViewById(R.id.btnfinish);

        String snama = getIntent().getStringExtra("nama");
        String skelas = getIntent().getStringExtra("kelas");
        nama.setText(snama);
        kelas.setText(skelas);

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahfinish = new Intent(halaman2.this, MainActivity.class);
                startActivity(pindahfinish);
                halaman2.this.finish();
            }
        });

    }
}