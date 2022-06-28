package com.company;

import java.util.Scanner;

public class KlantWerk extends Klant{
    String klantWerk;

    public KlantWerk(String klantWerk, Tarief tarief, String naam, String achternaam, String telefoonNm,  KlantEigenschap klantEigenschap) {
        super(tarief, naam, achternaam, telefoonNm, klantEigenschap);
        this.klantWerk = klantWerk;
    }

    public KlantWerk()
    {}

    public String getKlantWerk() {
        return klantWerk;
    }

    @Override
    public void klantAanmaken() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wat is uw naam");
        String naam = sc.nextLine();
        System.out.println("Wat is uw achternaam");
        String achternaam = sc.nextLine();
        System.out.println("Wat is uw telefoonnummer");
        String telefoonNm = sc.nextLine();
        System.out.println("Heeft u een kortings pas en werkt u in de weekend j/n?");
        String eigenschap = sc.nextLine();
        System.out.println("Hoeveel verdient u per uur");
        double tarief = sc.nextDouble();
        sc.nextLine();
        System.out.println("Wat voor project is het?");
        String project = sc.nextLine();
        KlantEigenschap klanteigenschap = null;
        if (eigenschap.equals("j")) {
            Wel wel = new Wel();
            klanteigenschap = wel;
        } else if(eigenschap.equals("n")){
            Geen geen = new Geen();
            klanteigenschap = geen;
        }
        Tarief tarief1 = new ProjectTarief(tarief, project);
        Klant klant1 = new KlantWerk("Werk", tarief1, naam, achternaam, telefoonNm, klanteigenschap);
    }

    @Override
    public void notifyKlant() {
        int i = 0;
        System.out.println("Welcome: " + klanten.get(i).getNaam() + " To our app!");
        i = i +1;
    }

    @Override
    public void printKlant() {
        for (int i = 0; i < klanten.size(); i++) {
            System.out.println("Klant " + klanten.get(i).getNaam() +" "+ klanten.get(i).getAchternaam() + " is aangemaakt ");
            System.out.println("Telefoonnummer: "+ klanten.get(i).getTelefoonNm());
            System.out.println("Verdient: "+ klanten.get(i).getTarief().getVerdient());
            System.out.println("Korting: " + klanten.get(i).getKlantEigenschap().getKorting());
            System.out.println("Werkt in weekend: " + klanten.get(i).getKlantEigenschap().getWeekendWerk());
        }
    }

    public void alleKlanten() {
        for (int i = 0; i < klanten.size(); i++) {
            System.out.println(i + 1 + ". " + klanten.get(i).getNaam() + " | " +
                    klanten.get(i).getAchternaam()+ " | " + klanten.get(i).getTelefoonNm());
        }
    }
}
