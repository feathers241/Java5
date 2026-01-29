package com.example.lab3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.lab3.entity.DB;

@Controller
@RequestMapping("/Bai5")
public class Bai5Controller {
	@GetMapping()
	public String main(Model m) {
		m.addAttribute("items",DB.items.values());
		return "Bai5/form";
	}
}
