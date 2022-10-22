package com.example.cobaparcelable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class coba_checkbox extends AppCompatActivity {

    CheckBox ayammenu, basomenu, miemenu;
    TextView pilihan1, pilihan2, pilihan3;
    String menu1, menu2, menu3;
    Button pesan, backchek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coba_checkbox);

        ayammenu = (CheckBox) findViewById(R.id.ayam);
        basomenu = (CheckBox) findViewById(R.id.bakso);
        miemenu = (CheckBox) findViewById(R.id.mie);
        pilihan1 = (TextView) findViewById(R.id.pilihan_satu);
        pilihan2 = (TextView) findViewById(R.id.pilihan_dua);
        pilihan3 = (TextView) findViewById(R.id.pilihan_tiga);
        pesan = (Button) findViewById(R.id.pesan);
        backchek = (Button) findViewById(R.id.btnback);

        backchek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backcheck = new Intent(coba_checkbox.this,halaman_utama.class);
                startActivity(backcheck);
                coba_checkbox.this.finish();
            }
        });

        pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Melihat Status Kondisi Pada Pilihan Menu Ayam Goreng
                if(!ayammenu.isChecked() && !basomenu.isChecked() && !miemenu.isChecked()){
                    Toast.makeText(getApplicationContext(), "Tidak Ada Menu yang Dipesan", Toast.LENGTH_SHORT).show();
                    pilihan1.setText("");
                    pilihan2.setText("");
                    pilihan3.setText("");
                }else {
                    if (ayammenu.isChecked()) {
                        menu1 = "Ayam Goreng";
                        pilihan1.setText(menu1);
                    } else if (!ayammenu.isChecked()) {
                        menu1 = "";
                        pilihan1.setText(menu1);
                    }

                    // Melihat Status Kondisi Pada Pilihan Menu Bakso
                    if (basomenu.isChecked()) {
                        menu2 = "Baso";
                        pilihan2.setText(menu2);
                    } else if (!basomenu.isChecked()) {
                        menu2 = "";
                        pilihan2.setText(menu2);
                    }

                    // Melihat Status Kondisi Pada Pilihan Menu Mie Rebus
                    if (miemenu.isChecked()) {
                        menu3 = " Mie Rebus";
                        pilihan3.setText(menu3);
                    } else if (!basomenu.isChecked()) {
                        menu3 = "";
                        pilihan3.setText(menu3);
                    }

                }
            }
        });


    }
}