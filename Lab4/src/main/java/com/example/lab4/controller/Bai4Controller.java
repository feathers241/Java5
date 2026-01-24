package com.example.lab4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class Bai4Controller {

    @GetMapping("/index")
    public String index() {
        return "Bai4/home/index";
    }

    @GetMapping("/about")
    public String about() {
        return "Bai4/home/about";
    }
}
