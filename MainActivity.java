package com.example.pertemuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;


public class MainActivity extends AppCompatActivity {

    EditText inputTinggi,inputAlas;
    Button hitungLuas;
    TextView tampilHasil,tombolDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layouthitung);

        tombolDialog=(TextView)findViewById(R.id.tombolDialog);

        tombolDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });

        inputTinggi=(EditText) findViewById(R.id.inputTinggi);
        inputAlas=(EditText) findViewById(R.id.inputAlas);
        hitungLuas=(Button) findViewById(R.id.tombolhitung);
        tampilHasil=(TextView) findViewById(R.id.tampilhasil);

        hitungLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitungLuasSegitiga();
            }
        });

    }

    public void openDialog(){
        ContohDialog a = new ContohDialog();
        a.show(getSupportFragmentManager(),"contoh dialog");
    }

    public void hitungLuasSegitiga(){
        try{
            Double alas=Double.parseDouble(inputAlas.getText().toString());
            Double tinggi=Double.parseDouble(inputTinggi.getText().toString());
            Double luas=0.5*alas*tinggi;
            tampilHasil.setText(luas.toString());
        }
        catch(NumberFormatException e){
            tampilHasil.setText("Masukkan angka");
        }
    }

}