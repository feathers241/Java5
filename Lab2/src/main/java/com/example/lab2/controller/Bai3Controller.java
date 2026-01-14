package com.example.lab2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.lab2.entity.Product;

@Controller
@RequestMapping("/Bai3")
public class Bai3Controller {
	@GetMapping() 
	 public String form() { 
	  return "Bai3/form"; 
	 } 
	
	 @PostMapping("/save") 
	 public String save(@ModelAttribute("items") Product p) { 
	  return "Bai3/form"; 
	 } 
}
