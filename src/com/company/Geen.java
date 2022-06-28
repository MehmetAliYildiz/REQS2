package com.company;

public class Geen extends KlantEigenschap{

    public Geen() {
        super(new GeenFactory());
    }

    @Override
    public String toString() {
        return "korting: " + korting +
                "weekendWerk: " + weekendWerk;
    }
}
