package com.example.mailabel.persona;

public class persona {
    public String nom;

    public String gmail;

    public String img;

    public persona(String nom, String gmail, String img) {
        this.nom = nom;
        this.gmail = gmail;
        this.img = img;
    }

    public persona() {
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
