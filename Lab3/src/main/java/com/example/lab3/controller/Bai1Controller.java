package com.example.lab3.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.lab3.entity.Staff;

@Controller
@RequestMapping("/Bai1")
public class Bai1Controller {
	@GetMapping()
	public String temp(Model model) {
		Date date = new Date();
		Staff staff = new Staff("007","Nguyễn Văn James Bond","Dog.jpg",true,date,30000.123,0);
		model.addAttribute("staff",staff);
		return "Bai1/form";
	}
}
