package com.company;

public class KlantEigenschap {
    Korting korting;
    WeekendWerk weekendWerk;

    public KlantEigenschap(KlantEigenschapFactory klantEigenschapFactory) {
        this.korting = klantEigenschapFactory.createKorting();
        this.weekendWerk = klantEigenschapFactory.createWeekendWerk();
    }

    public Korting getKorting() {
        return korting;
    }

    public WeekendWerk getWeekendWerk() {
        return weekendWerk;
    }

    @Override
    public String toString() {
        return "korting: " + korting +
                ", weekendWerk: " + weekendWerk;
    }
}
