package com.example.mailabel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
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


    Fragment correus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        correus= new correusFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.correusFL,correus).commit();

    }



}