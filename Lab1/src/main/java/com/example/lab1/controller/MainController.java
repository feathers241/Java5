package com.example.lab1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MainController {
	
	@Autowired
	HttpServletRequest request;
	
	@RequestMapping("/kfadfa")  // http://localhost:8080/
	public String TenGiCungDuoc(Model m) {
		m.addAttribute("heading","Mời đồng chí nhập thông tin :");
		m.addAttribute("name" , "HelloWorld");
		return "main"; // main.html
	}
	@PostMapping( /*@RequestParam ("username") String username; , */ "/submit")
	public String submit(Model m) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		// @RequestParam ("password") String password;
		//* ReqeuestParam("gender", default = false) Boolean gender;s
		m.addAttribute("username",username);
		m.addAttribute("password",password);
		return "alert";
	}
	// Tham số trên đường dẫn ( "/edit?id={id}")
	// Tham số trên đường dẫn ( "/edit?{id}")
	@GetMapping("/adfadf")
	public String test () {
		return "Hello";
	}
}
