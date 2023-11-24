package com.truongvu.springcore.common;

import com.truongvu.springcore.common.Coach;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkOut() {
        return "Practice fast bowling for 15 minutes!!!";
    }
}
