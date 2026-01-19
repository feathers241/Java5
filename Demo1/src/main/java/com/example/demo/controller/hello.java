package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller   
public class hello {
	@GetMapping("/")
	public String hello (Model model) {
		List<String> list = List.of("A","B","C");
		model.addAttribute("list",list);
		return "hello";
	}
	@GetMapping("/list")
	public String MyList(Model model) {
		List<String> list = List.of("A","B","C");
		model.addAttribute("list",list);
		return "Layout/list";
	}
	@PostMapping("/submit")
	public String submit (@RequestParam String name, Model model) {
		model.addAttribute("getname",name);
		return "result";
	}
}
