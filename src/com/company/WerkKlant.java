package com.company;

import java.util.Scanner;

public class WerkKlant extends Klant{

    public WerkKlant(String type, Tarief tarief, String naam, String achternaam, String telefoonNm, KlantEigenschap klantEigenschap) {
        super(type, tarief, naam, achternaam, telefoonNm, klantEigenschap);
    }

    public WerkKlant() {
    }

    public void werkKlantAanmaken() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wat is uw naam");
        String naam = sc.nextLine();
        System.out.println("Wat is uw achternaam");
        String achternaam = sc.nextLine();
        System.out.println("Wat is uw telefoonnummer");
        String telefoonNm = sc.nextLine();
        System.out.println("Heeft u een kortings pas j/n?");
        String kortingsPas = sc.nextLine();
        System.out.println("Werkt u in de weekend j/n?");
        String weekendWerkend = sc.nextLine();
        System.out.println("Hoeveel verdient u per uur");
        double tarief = sc.nextDouble();
        sc.nextLine();
        System.out.println("Wat voor werk doet u?");
        String werk = sc.nextLine();
        Tarief tarief1 = new WerkTarief(tarief, werk);
        KlantEigenschap klantEigenschap = new KlantEigenschap(kortingsPas, weekendWerkend);
        Klant klant1 = new WerkKlant("Werk", tarief1, naam, achternaam, telefoonNm, klantEigenschap);
        System.out.println("Klant " + naam +" "+ achternaam + " is aangemaakt " + telefoonNm);
        System.out.println("Verdient: "+ tarief1.getVerdient());
        System.out.println("Korting: " + kortingsPas);
        System.out.println("Werkt in weekend: " + weekendWerkend);
        System.out.println("Zijn tarief per uur is: "+ tarief);
    }

    public void alleKlanten() {
        for (int i = 0; i < klanten.size(); i++) {
            System.out.println(i + 1 + ". " + klanten.get(i).getNaam() + " | " +
                    klanten.get(i).getAchternaam()+ " | " + klanten.get(i).getTelefoonNm());
        }
    }
}
