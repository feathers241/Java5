package com.example.lab1.controller;

import java.net.http.HttpRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Bai5")
public class Bai5Controller {

	@GetMapping()
	public String main() {
		return "Bai5/form";
	}
	@PostMapping("dienTich")
	public String dientich(Model m, @RequestParam("chieuDai") double chieuDai, @RequestParam("chieuRong") double chieuRong) {
		m.addAttribute("mess","Diện tích hình chủ nhật là "+(chieuDai*chieuRong));
		return "Bai5/form";
	}
	@PostMapping("chuVi")
	public String chuvi(Model m, @RequestParam("chieuDai") double chieuDai, @RequestParam("chieuRong") double chieuRong) {
		m.addAttribute("mess","Chu vi hình chủ nhật là "+(chieuDai+chieuRong)*2);
		return "Bai5/form";
	}
}
