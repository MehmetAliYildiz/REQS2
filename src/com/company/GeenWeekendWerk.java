package com.company;

public class GeenWeekendWerk implements WeekendWerk {
    private String answer;

    public GeenWeekendWerk(String answer) {
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
