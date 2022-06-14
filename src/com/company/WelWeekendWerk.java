package com.company;

public class WelWeekendWerk implements WeekendWerk {
    private String answer;

    public WelWeekendWerk(String answer) {
        this.answer = answer;
    }

    @Override
    public String assemble() {
        return "";
    }

    @Override
    public String toString() {
        return "Weekend Werk: " +
                "" + answer;
    }
}
