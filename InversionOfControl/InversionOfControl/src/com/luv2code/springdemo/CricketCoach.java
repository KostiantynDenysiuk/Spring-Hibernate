package com.luv2code.springdemo;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public CricketCoach() {
        System.out.println("CricketCoach: inside  no-arg constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method - SetFortuneService ");
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmailAddress(){
        return "Email address = " + this.emailAddress;
    }

    public String getTeam() {
        return "Team: " + this.team;
    }
}
