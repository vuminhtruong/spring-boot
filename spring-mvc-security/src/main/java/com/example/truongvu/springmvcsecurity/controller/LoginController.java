package com.example.truongvu.springmvcsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/showMyLoginPage")
    public String showMyLoginPage() {
        return "plain-text";
    }

    @GetMapping("/access-denied")
    public String showAccessDenied() {
        return "access-denied";
    }
}
