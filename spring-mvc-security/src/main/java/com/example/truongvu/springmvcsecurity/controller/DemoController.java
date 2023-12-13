package com.example.truongvu.springmvcsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @GetMapping("/")
    public String showHome() {
        return "home";
    }

    // add a request mapping for /leader
    @GetMapping("/leader")
    public String showLeaders() {
        return "leader";
    }

    @GetMapping("/system")
    public String showSystems() {
        return "system";
    }
}
