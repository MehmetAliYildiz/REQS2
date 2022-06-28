package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean nogEenKeer = true;
        Factuur factuur = new Factuur();
        KlantProject klantProject = new KlantProject();
        KlantWerk klantWerk = new KlantWerk();
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("[Controle paneel]");
                System.out.println("1. Lijst met klanten");
                System.out.println("2. Lijst met facturens");
                System.out.println("3. Nieuwe klant maken");
                System.out.println("4. Nieuwe factuur maken");
                System.out.println("5. Exit");
                System.out.println("Voer een commandnummer in");
                int commandnummer = scanner.nextInt();
                if (commandnummer == 1) {
                    klantWerk.alleKlanten();
                    klantProject.alleKlanten();
                } else if (commandnummer == 2) {
                    factuur.alleFacturen();
                } else if (commandnummer == 3) {
                    System.out.println("wat voor klant bent u. kies uit: Werk/Project");
                    scanner.nextLine();
                    String keuze = scanner.nextLine();
                    if (keuze.equals("Werk")) {
                        klantWerk.makeKlant();
                    }
                    else if (keuze.equals("Project")) {
                        klantProject.makeKlant();
                    } else {
                        System.out.println("Deze keuze bestaat niet");
                    }
                } else if (commandnummer == 4) {
                    factuur.factuurMaken();
                } else if (commandnummer == 5) {
                    System.out.println("Het systeem wordt afgesloten");
                    nogEenKeer = false;
                } else {
                    System.out.println("Command ongeldig");
                    System.out.println("________________");
                }
            } catch (InputMismatchException E) {
                System.out.println("Command ongeldig");
                System.out.println("________________");
            }
        } while (nogEenKeer);
    }
}





//                int paneel = scanner.nextInt();
////                switch (paneel){
////                    case 1:
////                        klantWerk.alleKlanten();
////                        klantProject.alleKlanten();
////                        break;
////                    case 2:
////                        factuur.alleFacturen();
////                        break;
////                    case 3:
////                        System.out.println("wat voor klant bent u. kies uit: Werk/Project");
////                        scanner.nextLine();
////                        String keuze = scanner.nextLine();
////                        if (keuze.equals("Werk")) {
////                            klantWerk.makeKlant();
////                        }
////                        else if (keuze.equals("Project")) {
////                            klantProject.makeKlant();
////                        } else {
////                            System.out.println("Deze keuze bestaat niet");
////                        }
////                        break;
////                    case 4:
////                        factuur.factuurMaken();
////                        break;
////                    case 5:
////                        System.out.println("Het systeem wordt afgesloten");
////                        nogEenKeer = false;
////                        break;
////                    default:
////                        System.out.println("Command ongeldig");
////                        System.out.println("________________");
////                }