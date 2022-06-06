package com.company;

public class GeenManufacturer extends ExtraKlantEigenschappen{

    @Override
    public Korting createKorting() {
        return new GeenKorting();
    }

    @Override
    public WeekendWerk createWeekendWerk() {
        return new GeenWeekendWerk();
    }
}
