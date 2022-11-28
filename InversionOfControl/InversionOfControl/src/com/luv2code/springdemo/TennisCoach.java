package com.luv2code.springdemo;

public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Play tennis every day!";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
