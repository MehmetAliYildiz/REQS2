package com.company;

import java.util.Scanner;

public class KlantProject extends Klant{
    String klantProject;

    public KlantProject(String klantProject, Tarief tarief, String naam, String achternaam, String telefoonNm, String korting, String weekendWerk) {
        super(tarief, naam, achternaam, telefoonNm, korting, weekendWerk);
        this.klantProject = "KlantProject";
    }

    public KlantProject() {}

    public String getKlantProject() {
        return klantProject;
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
        System.out.println("Heeft u een kortings pas j/n?");
        String kortingsPas = sc.nextLine();
        System.out.println("Werkt u in de weekend j/n?");
        String weekendWerkend = sc.nextLine();
        System.out.println("Hoeveel verdient u per uur");
        double tarief = sc.nextDouble();
        sc.nextLine();
        System.out.println("Wat voor project is het?");
        String project = sc.nextLine();
        Tarief tarief1 = new ProjectTarief(tarief, project);
        Klant klant1 = new KlantProject("Project", tarief1, naam, achternaam, telefoonNm, kortingsPas, weekendWerkend);
    }

    public void existingKlant() {
        Tarief tarief1 = new ProjectTarief(21, "Gebouwen bouwen");
        Klant klant1 = new KlantProject("Project",tarief1,"Mehmet", "Yildiz", "0685416936", "j", "j");
        klanten.add(klant1);
    }

    @Override
    public void printKlant() {
        int i = 0;
        System.out.println("Klant " + klanten.get(i).getNaam() +" "+ klanten.get(i).getAchternaam() + " is aangemaakt ");
        System.out.println("Telefoonnummer: "+ klanten.get(i).getTelefoonNm());
        System.out.println("Verdient: "+ klanten.get(i).getTarief());
        System.out.println("Korting: " + klanten.get(i).getKorting());
        System.out.println("Werkt in weekend: " + klanten.get(i).getWeekendWerk());
        i = i +1;
    }

    @Override
    public void notifyKlant() {
        int i = 0;
        System.out.println("Welcome: " + klanten.get(i).getNaam() + " To our app!");
        i = i +1;
    }

    public void alleKlanten() {
        for (int i = 0; i < klanten.size(); i++) {
            System.out.println(i + 1 + ". " + klanten.get(i).getNaam() + " | " +
                    klanten.get(i).getAchternaam()+ " | " + klanten.get(i).getTelefoonNm());
        }
    }
}
