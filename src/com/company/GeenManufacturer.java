package com.company;

public class GeenManufacturer extends Company{

    @Override
    public Korting createKorting(String s) {
        return new GeenKorting("geen");
    }

    @Override
    public WeekendWerk createWeekendWerk(String s) {
        return new GeenWeekendWerk("geen");
    }
}
