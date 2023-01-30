package com.example.mailabel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mailabel.persona.adapterPersona;
import com.example.mailabel.persona.email;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static FragmentTransaction transaction;
    public static FragmentTransaction transaction2;
    Fragment correus;
    Fragment missatge;
    public  email correu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        correus= new correusFragment();
        missatge=new MissatgeFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.correusFL,correus).commit();


    }

    public  void hola(Fragment f,email e){
        transaction=getSupportFragmentManager().beginTransaction();

        correu=e;
        transaction.replace(R.id.correusFL,f);
        transaction.commit();


    }

    public void fragmentLlista(){
        transaction2=getSupportFragmentManager().beginTransaction();
        transaction2.replace(R.id.correusFL,correus);
        transaction2.commit();
    }



}