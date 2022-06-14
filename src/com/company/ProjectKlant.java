package com.company;

import java.util.Scanner;

public class ProjectKlant extends Klant{

    public ProjectKlant(String type, Tarief tarief, String naam, String achternaam, String telefoonNm, KlantEigenschap klantEigenschap) {
        super(type, tarief, naam, achternaam, telefoonNm, klantEigenschap);
    }

    public ProjectKlant(){}

    public void projectKlantAanmaken() {
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
        System.out.println("Wat voor project is het?");
        String project = sc.nextLine();
        KlantEigenschap klantEigenschap = new KlantEigenschap(kortingsPas, weekendWerkend);
        Tarief tarief1 = new ProjectTarief(tarief, project);
        Klant klant1 = new ProjectKlant("Project", tarief1, naam, achternaam, telefoonNm, klantEigenschap);
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
