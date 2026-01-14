package com.example.lab1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Bai3")
public class Bai3Controller {
	
	@GetMapping()
	public String Hell() {
		return "Bai3/Hello";
	}
}
