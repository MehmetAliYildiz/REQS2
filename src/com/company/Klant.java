package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Klant {
    private String naam;
    private String achternaam;
    private String telefoonNm;
    private Tarief tarief;
    private KlantEigenschap klantEigenschap;
    private String type;
    public static ArrayList<Klant> klanten= new ArrayList<>();

    public Klant(String type, Tarief tarief, String naam, String achternaam, String telefoonNm, KlantEigenschap klantEigenschap) {
        this.type = type;
        this.naam = naam;
        this.tarief = tarief;
        this.achternaam = achternaam;
        this.telefoonNm = telefoonNm;
        this.klantEigenschap = klantEigenschap;
        klanten.add(this);
    }

    public Klant() {}

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

    public String getType() {
        return type;
    }

    public void setKlantEigenschap( KlantEigenschap klantEigenschap) {
        this.klantEigenschap = klantEigenschap;
    }

//    public void alleKlanten() {
//        for (int i = 0; i < klanten.size(); i++) {
//            System.out.println(i + 1 + ". " + klanten.get(i).getNaam() + " | " +
//                    klanten.get(i).getAchternaam()+ " | " + klanten.get(i).getTelefoonNm());
//        }
//    }
}
