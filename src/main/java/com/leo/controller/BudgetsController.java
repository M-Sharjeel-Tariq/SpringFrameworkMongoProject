package com.leo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BudgetsController {
    
    @RequestMapping("/welcome")
    public String welcome() {
        System.out.println("Hollow World");
        return "index";
    }

}
