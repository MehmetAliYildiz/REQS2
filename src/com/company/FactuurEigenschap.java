package com.company;

public class FactuurEigenschap {
    private String kvkNummer;
    private int btwBedrag;
    private int factuurNummer;

    public FactuurEigenschap(String kvkNummer, int btwBedrag, int factuurNummer) {
        this.kvkNummer = kvkNummer;
        this.btwBedrag = btwBedrag;
        this.factuurNummer = factuurNummer;
    }

    public String getKvkNummer() {
        return kvkNummer;
    }

    public int getBtwBedrag() {
        return btwBedrag;
    }

    public int getFactuurNummer() {
        return factuurNummer;
    }


}
