package com.company;

public class GeenFactory extends KlantEigenschapFactory {

    @Override
    public Korting createKorting() {
        return new GeenKorting();
    }

    @Override
    public WeekendWerk createWeekendWerk() {
        return new GeenWeekendWerk();
    }
}
