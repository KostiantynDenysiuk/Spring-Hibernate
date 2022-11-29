package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class YachtCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Catch you wind!";
    }
}
