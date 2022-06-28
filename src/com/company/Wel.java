package com.company;

public class Wel extends KlantEigenschap{

    public Wel() {
        super(new WelFactory());
    }

    @Override
    public String toString() {
        return "korting: " + korting +
                "weekendWerk: " + weekendWerk;
    }
}
