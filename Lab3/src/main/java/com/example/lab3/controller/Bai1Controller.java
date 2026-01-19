package com.example.lab3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.lab3.entity.Staff;

import lombok.Builder;

@Controller
@RequestMapping("/Bai1")
public class Bai1Controller {
	@GetMapping()
	public String temp(Model model) {
		Staff staff = Staff.builder()
				.id("user@gmail.com") 
				.fullname("nguyễn văn user") 
				.level(2) 
				.build(); 
				model.addAttribute("staff", staff); 
		return "Bai1/form";
	}
}
