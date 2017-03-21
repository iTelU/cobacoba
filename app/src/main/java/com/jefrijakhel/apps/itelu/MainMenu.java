package com.jefrijakhel.apps.itelu;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainMenu extends AppCompatActivity {

    Button btnMenuTimeline, btnMenuHome, btnMenuSetting,btnKost,btnLaundry,btnRestaurant,btnPemesanan;
    TextView txtLaundry,txtKost,txtRestaurant,txtPemesanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        btnMenuHome = (Button)findViewById(R.id.btnMenuHome);
        btnMenuTimeline = (Button)findViewById(R.id.btnMenuTimeline);
        btnMenuSetting = (Button)findViewById(R.id.btnMenuSetting);
        btnKost = (Button)findViewById(R.id.btnKost);
        btnLaundry = (Button)findViewById(R.id.btnLaundry);
        btnPemesanan = (Button)findViewById(R.id.btnPemesanan);
        btnRestaurant = (Button)findViewById(R.id.btnRestaurant);
        txtLaundry = (TextView)findViewById(R.id.txtLaundry);
        txtKost = (TextView)findViewById(R.id.txtKost);
        txtPemesanan = (TextView)findViewById(R.id.txtPemesanan);
        txtRestaurant = (TextView)findViewById(R.id.txtRestaurant);


        btnMenuHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = MainMenu.this;
                String message = "Aplikasi Belum Selesai";
                Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
            }
        });
        btnMenuTimeline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = MainMenu.this;
                String message = "Aplikasi Belum Selesai";
                Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
            }
        });
        btnMenuSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = MainMenu.this;
                String message = "Aplikasi Belum Selesai";
                Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
            }
        });
        btnKost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = MainMenu.this;
                String message = "Aplikasi Belum Selesai";
                Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
            }
        });
        btnLaundry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = MainMenu.this;
                String message = "Aplikasi Belum Selesai";
                Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
            }
        });
        btnPemesanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = MainMenu.this;
                String message = "Aplikasi Belum Selesai";
                Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
            }
        });
        btnRestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = MainMenu.this;
                String message = "Aplikasi Belum Selesai";
                Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
