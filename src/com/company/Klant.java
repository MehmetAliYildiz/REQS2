package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Klant {
    private String naam;
    private String achternaam;
    private String telefoonNm;
    private Tarief tarief;
    private String korting;
    private String weekendWerk;
    public static ArrayList<Klant> klanten= new ArrayList<>();

    public Klant(Tarief tarief, String naam, String achternaam, String telefoonNm, String korting, String weekendWerk) {
        this.naam = naam;
        this.tarief = tarief;
        this.achternaam = achternaam;
        this.telefoonNm = telefoonNm;
        this.korting = korting;
        this.weekendWerk = weekendWerk;
        klanten.add(this);
    }

    public abstract Korting createKorting();
    public abstract WeekendWerk createWeekendWerk();

    public Klant(){}

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

    public String getKorting() {
        return korting;
    }

    public String getWeekendWerk() {
        return weekendWerk;
    }
}
