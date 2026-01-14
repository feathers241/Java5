package com.example.lab2.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.lab2.entity.Product;

@Controller
@RequestMapping("/Bai4")
public class Bai4Controller {
	
	@GetMapping() 
	 public String form(Model m) { 
	  Product p = new Product(); 
	  p.setName("iPhone 30"); 
	  p.setPrice(5000.0); 
	  m.addAttribute("first",p);
	  return "Bai4/form"; 
	 } 
	 @PostMapping("/product/save") 
	 public String save(@ModelAttribute("second") Product p){
		 return "Bai4/form"; 
	 } 
	 @ModelAttribute("Product")
	 public List<Product> getItems() { 
		 return Arrays.asList(new Product("A",1.2), new Product("B",1.3));
	 } 
}
