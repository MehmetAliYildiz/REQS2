package com.company;

public class WelKorting implements Korting{
    private String answer;

    public WelKorting(String answer) {
        this.answer = answer;
    }

    @Override
    public String assemble() {
        return "";
    }

    @Override
    public String toString() {
        return "Korting: " +
                "" + answer;
    }
}
