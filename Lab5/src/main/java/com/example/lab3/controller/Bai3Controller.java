package com.example.lab3.controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.lab3.bai1.CookieService;
import com.example.lab3.bai1.ParamService;
import com.example.lab3.bai1.SessionService;

import jakarta.servlet.annotation.MultipartConfig;


@Controller
@RequestMapping("/Bai3")
public class Bai3Controller {
	@Autowired 
	CookieService cookieService; 
	@Autowired 
	ParamService paramService; 
	@Autowired 
	SessionService sessionService; 
	
	@GetMapping()
	public String main() {
		return "Bai3/form";
	}
	@PostMapping("/submit")
	public String get(Model m, @RequestParam("pic") MultipartFile pic) {
		String username = paramService.getString("username", "");
		String password = paramService.getString("password", "");
		boolean remember = paramService.getBoolean("remember",false);
		File file = paramService.save(pic,"/Bai3/images");
		if(username.equals("poly") && password.equals("123")) {
			m.addAttribute("mess","Đăng nhập thành công");
			sessionService.set("user", username);
			sessionService.set("pass",password);
			if(file != null) {
			    m.addAttribute("img", file.getName());
			}
			if(remember) {
				cookieService.add("user", username, 10);
				cookieService.add("pass", password, 10);
				m.addAttribute("us",username);
				m.addAttribute("pw",password);
				m.addAttribute("re",remember);
			}else {
				cookieService.add("user", "", 0);
				cookieService.add("pass", "", 0);
			}
		}
		return "Bai3/form";
	}
}
