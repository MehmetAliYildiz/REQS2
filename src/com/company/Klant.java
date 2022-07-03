package com.company;

import java.util.ArrayList;

public abstract class Klant {
    private String naam;
    private String achternaam;
    private String telefoonNm;
    private Tarief tarief;
//    private String korting;
//    private String weekendWerk;
    private KlantEigenschap klantEigenschap;
    public static ArrayList<Klant> klanten= new ArrayList<>();

    public Klant(Tarief tarief, String naam, String achternaam, String telefoonNm, KlantEigenschap klantEigenschap) {
        this.naam = naam;
        this.tarief = tarief;
        this.achternaam = achternaam;
        this.telefoonNm = telefoonNm;
        this.klantEigenschap = klantEigenschap;
        klanten.add(this);
    }

    public Klant(){}

    public KlantEigenschap getKlantEigenschap() {
        return klantEigenschap;
    }

    public abstract void klantAanmaken();

    public abstract void printKlant();

    public abstract void notifyKlant();

    final void makeKlant(){
        klantAanmaken();
        printKlant();
        notifyKlant();
    }

    public Tarief getTarief() {
        return tarief;
    }

    public String getNaam() {
        return naam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public String getTelefoonNm() {
        return telefoonNm;
    }

    public static ArrayList<Klant> getKlanten() {
        return klanten;
    }
}
