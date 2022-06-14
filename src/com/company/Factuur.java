package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Factuur extends Klant implements BerekenTarief, PrintFacturen {
    private String kvkNummer;
    private int btwBedrag;
    private String datum;
    private Klant klant;
    private int factuurNummer;
    private int urenWerken;
    private static ArrayList<Factuur> factuurs = new ArrayList<>();

    public Factuur(Klant klant, String kvkNummer, int btwBedrag, String datum, int factuurNummer, int urenWerken) {
        this.klant = klant;
        this.kvkNummer = kvkNummer;
        this.btwBedrag = btwBedrag;
        this.datum = datum;
        this.factuurNummer = factuurNummer;
        this.urenWerken = urenWerken;
        factuurs.add(this);
    }

    public Factuur() {}

    public String getKvkNummer() {
        return kvkNummer;
    }

    public Klant getKlant() {
        return klant;
    }

    public int getBtwBedrag() {
        return btwBedrag;
    }

    public String getDatum() {
        return datum;
    }

    public int getFactuurNummer() {
        return factuurNummer;
    }

    public int getUrenWerken() {
        return urenWerken;
    }

    public static ArrayList<Factuur> getFactuurs() {
        return factuurs;
    }

    @Override
    public void alleFacturen() {
        for (int i = 0; i < Factuur.getFactuurs().size(); i++) {
            System.out.println("Naam: "+ Factuur.getFactuurs().get(i).getKlant().getNaam()+ " "
                    + Factuur.getFactuurs().get(i).getKlant().getAchternaam());
            System.out.println("Kvk nummer: " + Factuur.getFactuurs().get(i).getKvkNummer());
            System.out.println("Datum: " + Factuur.getFactuurs().get(i).getDatum());
            System.out.println("Factuur Nummer: " + Factuur.getFactuurs().get(i).getFactuurNummer());
            System.out.println("BTW bedrag: " + Factuur.getFactuurs().get(i).getBtwBedrag()
                    + "    " + "Uren gewerkt: " + Factuur.getFactuurs().get(i).getUrenWerken());
            System.out.println("Het totaal bedrag exclusief BTW is: "+ getBedrag());
        }
    }

    @Override
    public double getBedrag() {
        double total = 0;
        for (int i = 0; i < Klant.getKlanten().size(); i++) {
            for (int y = 0; y < Factuur.getFactuurs().size(); y++) {
                    total = Klant.getKlanten().get(i).getTarief().getTarief() * Factuur.getFactuurs().get(y).getUrenWerken();
            }
        }
        return total;
    }



    public void factuurMaken(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Wat is uw naam?");
        String naam = sc.nextLine();
        System.out.println("Wat is uw telefoonnummer?");
        String nummer = sc.nextLine();
        for (int i = 0; i < Klant.getKlanten().size(); i++) {
            if(naam.equals(Klant.getKlanten().get(i).getNaam()) && (nummer.equals(Klant.getKlanten().get(i).getTelefoonNm()))){
                System.out.println("U kunt nu een factuur maken.");
                System.out.println("Wat is uw kvk nummer?");
                sc.nextLine();
                String kvkNummer = sc.nextLine();
                System.out.println("Wat is de BTW bedrag?");
                int btwBedrag = sc.nextInt();
                sc.nextLine();
                System.out.println("Wat is de datum?");
                String datum = sc.nextLine();
                System.out.println("Wat is de factuur nummer?");
                int factuurNummer = sc.nextInt();
                System.out.println("Hoe lang heeft u gewerkt?");
                int urenWerken = sc.nextInt();
                Factuur factuur1 = new Factuur(Klant.getKlanten().get(i), kvkNummer, btwBedrag, datum, factuurNummer, urenWerken);
                System.out.println("Klant: "+ Klant.getKlanten().get(i).getNaam()+ " "+ Klant.getKlanten().get(i).getTarief());
                printEenFactuur();
            }
        }
    }

    public void printEenFactuur(){
        for (int y = 0; y < Factuur.getFactuurs().size(); y++) {
            System.out.println("kvk nummer: " + Factuur.getFactuurs().get(y).getKvkNummer());
            System.out.println("Datum: " + Factuur.getFactuurs().get(y).getDatum());
            System.out.println("Factuur Nummer: " + Factuur.getFactuurs().get(y).getFactuurNummer());
            System.out.println("------------------------------------------------------------");
            System.out.println("BTW bedrag: " + Factuur.getFactuurs().get(y).getBtwBedrag());
            System.out.println("Uren gewerkt: " + Factuur.getFactuurs().get(y).getUrenWerken());
            System.out.println("------------------------------------------------------------");
            System.out.println("Het totaal bedrag exclusief BTW is: "+ getBedrag());
        }
    }
}
