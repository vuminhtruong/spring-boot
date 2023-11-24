package com.truongvu.springcore.rest;

import com.truongvu.springcore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private Coach coach;
    private Coach anotherCoach;

//    @Autowired
//    public Controller(Coach coach) {
//        this.coach = coach;
//    }

    @Autowired
    public void setCoach(@Qualifier("cricketCoach") Coach coach,@Qualifier("cricketCoach") Coach anotherCoach) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        this.coach = coach;
        this.anotherCoach = anotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return  coach.getDailyWorkOut();
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing beans: coach == anotherCoach, " + (this.coach == this.anotherCoach); // singleton: true , prototype: false
    }
}
