package Springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {


    private Springdemo.FortuneService fortuneService;
    @Value("${foo.email}")
    private String email;
    @Value("${foo.team}")
    private String team;


    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    @Override
    public String getDailyWorkout() {
        return "Swim 1k meters as a warm up.";
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
