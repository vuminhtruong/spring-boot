package com.truongvu.springmvcthymeleaf.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.http.HttpRequest;

@Controller
public class HelloWorldController {
    @GetMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String processSecondForm(HttpServletRequest request, Model model) {
        String name = request.getParameter("studentName");
        name = name.toUpperCase();
        String result = "Yo!" + name;
        model.addAttribute("message", result);
        return "helloworld";
    }

    @PostMapping("/processFormVersionThree")
    public String processThreeForm(@RequestParam("studentName") String name, Model model) {
        name = name.toUpperCase();
        String result = "StudentName from v3! " + name;
        model.addAttribute("message", result);
        return "helloworld";
    }

}
