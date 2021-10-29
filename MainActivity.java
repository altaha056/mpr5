package com.example.pertemuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_pertama);

//        variabel primitif
//        variabel reference

        ImageView kotakgambar = findViewById(R.id.komponengambar);

        String urlgambar = "https://upload.wikimedia.org/wikipedia/commons/2/24/Oceanic_Whitetip_Shark.png";

        Picasso.with(this).load(urlgambar).into(kotakgambar);


    }
}