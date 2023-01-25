package com.example.mailabel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.mailabel.persona.email;

public class Detall extends AppCompatActivity {

    Fragment correus;
    Fragment missatge;

    Bundle datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detall);


        datos = getIntent().getExtras();
        email emaill= (email) datos.get("correu");


        correus = new correusFragment();
        missatge = new MissatgeFragment();


        getIntent().putExtra("correu",emaill);


        getSupportFragmentManager().beginTransaction().add(R.id.correusDetallFL,correus).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.missatgeCorreuFL,missatge).commit();


    }
}