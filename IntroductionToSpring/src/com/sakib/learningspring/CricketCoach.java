package com.sakib.learningspring;

public class CricketCoach implements Coach {

    private String emailAddress;
    private String team;
    private FortuneService fortuneService;

    // A constructor with no arguments
    public CricketCoach() {
        System.out.println("I am in the constructor of CricketCoach");
    }

    // Setter method


    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: inside setter method  - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: inside setter method  - setTeam");
        this.team = team;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("I am in the setFortuneService method of CricketCoach class");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15minutes!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
