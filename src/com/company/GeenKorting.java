package com.company;

public class GeenKorting implements Korting{
    private String answer;
    public GeenKorting(String answer) {
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
