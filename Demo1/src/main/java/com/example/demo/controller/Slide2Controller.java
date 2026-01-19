package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/Slide2")
public class Slide2Controller {
	
	@GetMapping("/form")
	public String main() {
		return "Slide2/form";
	}
	
	@PostMapping("/upload")
	public String paRt(@RequestParam("file") MultipartFile file , Model m) {
		m.addAttribute("name",file.getOriginalFilename());
		return "Slide2/form";
	}
	@GetMapping("path/{id}")
	public String getid(@PathVariable("id") int id, Model m) {
		m.addAttribute("getID",id);
		return "Slide2/PathVa";
	}
}
