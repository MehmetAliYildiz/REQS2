package com.company;

public class KlantEigenschap {
    private String korting;
    private String weekendWerk;

    KlantEigenschap(String korting, String weekendWerk) {
        this.korting = korting;
        this.weekendWerk = weekendWerk;
    }

    public String getKorting() {
        return korting;
    }

    public String getWeekendWerk() {
        return weekendWerk;
    }
}
