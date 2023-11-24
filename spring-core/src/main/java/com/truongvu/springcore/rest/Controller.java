package com.truongvu.springcore.rest;

import com.truongvu.springcore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private Coach coach;

//    @Autowired
//    public Controller(Coach coach) {
//        this.coach = coach;
//    }

    @Autowired
    public void setCoach(@Qualifier("cricketCoach") Coach coach) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        this.coach = coach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return  coach.getDailyWorkOut();
    }

}
