package com.truongvu.springmvcthymeleaf.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/hello")
    public String sayHello(Model model) {
        model.addAttribute("theDate",new java.util.Date());

        return "helloworld";
    }
}
