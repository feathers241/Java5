package com.example.lab2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Bai1")
public class Bai1Controller {
	@GetMapping()
	public String ok() {
		return "Bai1/ok";
	}
	@PostMapping("/ctrl/ok")
	public String m1(Model m) {
		m.addAttribute("result","m1");
		return "Bai1/ok";
	}
	@GetMapping("/ctrl/ok")
	public String m2(Model m) {
		m.addAttribute("result","m2");
		return "Bai1/ok";
	}
	@RequestMapping(value = "/ctrl/ok", params = "x" , method = RequestMethod.POST)
	public String m3(Model m, @RequestParam("x") int x) {
		m.addAttribute("result","m3 +"+x);
		return "Bai1/ok";
	}
}
