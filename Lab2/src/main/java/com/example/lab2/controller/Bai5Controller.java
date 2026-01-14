package com.example.lab2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class Bai5Controller {
	 @GetMapping("/a") 
	 public String m1() { 
	  return "Bai5/form"; 
	 } 
	 @RequestMapping("/b") 
	 public String m2(Model model) { 
	  model.addAttribute("message", "Từ b qua"); 
	  return "forward:/a"; 
	 } 
	 @RequestMapping("/c") 
	 public String m3(RedirectAttributes params) { 
	  params.addAttribute("message", "Từ c"); 
	  return "redirect:/a"; 
	 } 
	 @ResponseBody
	 @RequestMapping("/d") 
	 public String m4() { 
	  return "PathVarible /d Return về dòng này"; 
	 } 
}
