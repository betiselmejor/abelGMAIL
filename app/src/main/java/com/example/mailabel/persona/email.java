package com.example.mailabel.persona;

import java.io.Serializable;

public class email implements Serializable {
    public String nom;

    public String gmail;

    public int img;

    public String missatge = "Andando al andén, al andén andando\n" +
            "De vagón en vagón vagando\n" +
            "A un metro del metro yo la vi\n" +
            "Perdimos el tren, lo dejamos ir\n" +
            "Andando al andén, al andén andando\n" +
            "Andando al andén, al andén andando\n" +
            "Andando al andén, al andén andando\n" +
            "Andando al andén, al andén andando\n" +
            "Andando al andén, al andén andando\n" +
            "Andando al andén, al andén andando\n" +
            "Andando al andén, al andén andando\n" +
            "Andando al andén, al andén andando\n" +
            "Andando al andén, al andén andando\n" +
            "Andando al andén, al andén andando\n" +
            "Andando al andén, al andén andando\n" +
            "Andando al andén, al andén andando\n" +
            "Andando al andén, al andén andando\n" +
            "Andando al andén, al andén andando\n" +
            "Andando al andén, al andén andando\n" +
            "Andando al andén, al andén andando\n" +
            "De vagón en vagón vagando\n" +
            "Locos de amor, locos de pena\n" +
            "Porque perdí a mi morena\n" +
            "A un metro del metro nos conocimos\n" +
            "Entre tren y tren nos entretuvimos\n" +
            "Dime dónde vas que yo voy contigo\n" +
            "Tu destino me queda de camino\n" +
            "De vagón en vagón haciendo el vago\n" +
            "Desde que te fuiste yo no sé qué hago\n" +
            "Yo solo quiero vivir tranquilo\n" +
            "Pero en tus curvas me descarrilo\n" +
            "Entre coches y llantas metí la pata\n" +
            "Escapé por poco casi me mata\n" +
            "Mirando los trenes que van y vienen\n" +
            "Pero ninguno me lleva con mi gata\n" +
            "Algunos trenes pasan solo una vez\n" +
            "Otros nunca pasan, y hay que hacer el camino a pie (andando al andén)\n" +
            "Andando al andén, al andén andando\n" +
            "De vagón en vagón vagando\n" +
            "A un metro del metro yo la vi\n" +
            "Perdimos el tren, lo dejamos ir";

    public email(String nom, String gmail, int img) {
        this.nom = nom;
        this.gmail = gmail;
        this.img = img;
    }

    public email(String gmail) {
        this.gmail = gmail;
    }

    public email() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getMissatge() {
        return missatge;
    }

    public void setMissatge(String missatge) {
        this.missatge = missatge;
    }
}
