package com.company;

public class WelFactory extends KlantEigenschapFactory {

    @Override
    public Korting createKorting() {
        return new WelKorting();
    }

    @Override
    public WeekendWerk createWeekendWerk() {
        return new WelWeekendWerk();
    }
}
