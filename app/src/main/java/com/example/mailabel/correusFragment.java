package com.example.mailabel;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.mailabel.persona.adapterPersona;
import com.example.mailabel.persona.email;

import java.util.ArrayList;


public class correusFragment extends Fragment {
        RecyclerView RV;
        ArrayList<email> correus;
        View vista;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista =inflater.inflate(R.layout.fragment_correus, container, false);





        ompleLlista();




        return  vista;
    }

    public void ompleLlista(){

        correus = new ArrayList<>();
        correus.add(new email("arnauov@gmail.com","holaquetalpremoquevienequeva"));
        correus.add(new email("arnauof1@gmail.com"));
        correus.add(new email("hiperpikachu777@gmail.com"));
        correus.add(new email("pigueta.sf@gmail.com"));
        correus.add(new email("holaquepasatronko@gmail.com"));
        correus.add(new email("drogas@gmail.com"));
        correus.add(new email("fiestaPagana@gmail.com"));
        correus.add(new email("laRaiz@gmail.com"));
        correus.add(new email("magoDeOz@gmail.com"));
        correus.add(new email("estopa@gmail.com"));
        correus.add(new email("acdc@gmail.com"));
        correus.add(new email("bejo@gmail.com"));
        correus.add(new email("IIIPekeño@gmail.com"));
        correus.add(new email("hoke@gmail.com"));
        correus.add(new email("chimbala@gmail.com"));

        adapterPersona ap = new adapterPersona(correus,getContext());

        RV = (RecyclerView) vista.findViewById(R.id.recyclerviewEMAILS);
        RV.setLayoutManager(new LinearLayoutManager(getContext()));

        ap.setOnclickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),correus.get(RV.getChildAdapterPosition(v)).getGmail(),Toast.LENGTH_SHORT).show();
                Fragment missatge = new MissatgeFragment();

                ((MainActivity)getActivity()).hola(missatge,correus.get(RV.getChildAdapterPosition(v)));

            }
        });

        RV.setAdapter(ap);


    }
}