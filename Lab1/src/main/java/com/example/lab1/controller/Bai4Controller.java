package com.example.lab1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/Bai4")
public class Bai4Controller {
	
	@Autowired
	HttpServletRequest request;
	
	@GetMapping()
	public String form() {
		return "Bai4/form";
	}
	
	@PostMapping("submit")
	public String sumbit(Model m , @RequestParam ("username") String user , @RequestParam("password") String pass) {
		if(user.equals("poly") && pass.equals("123")) {
			m.addAttribute("mess","Đăng nhập thành cônng");
			m.addAttribute("username",user);
			return "BaiLamThem/TrangChu";
		}else {
			m.addAttribute("mess","Đăng nhập thất bại !");
			return "Bai4/form";
		}
	}
}
