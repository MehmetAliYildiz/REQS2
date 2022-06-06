package com.company;

public class WelManufacturer extends ExtraKlantEigenschappen{
    @Override
    public Korting createKorting() {
        return new WelKorting();
    }

    @Override
    public WeekendWerk createWeekendWerk() {
        return new WelWeekendWerk();
    }
}
