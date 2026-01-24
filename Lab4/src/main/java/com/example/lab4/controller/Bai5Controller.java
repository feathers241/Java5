package com.example.lab4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Bai5/home")
public class Bai5Controller {

    @GetMapping("/index")
    public String index() {
        return "Bai5/home/index";
    }

    @GetMapping("/about")
    public String about() {
        return "Bai5/home/about";
    	}
	}
