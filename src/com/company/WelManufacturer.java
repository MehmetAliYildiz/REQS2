package com.company;

public class WelManufacturer extends Company{

    public WelManufacturer() {
    }

    @Override
    public Korting createKorting(String s) {
        return new WelKorting("wel");
    }

    @Override
    public WeekendWerk createWeekendWerk(String s) {
        return new WelWeekendWerk("wel");
    }

}
