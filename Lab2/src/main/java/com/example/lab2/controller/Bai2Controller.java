package com.example.lab2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Bai2")
public class Bai2Controller {
	@GetMapping()
	public String main() {
		return "Bai2/Path";
	}
	@PostMapping(value = "/param/save/{x}", params = "y")
	public String non_main(Model m, @RequestParam("y") String y, @PathVariable("x") String x) {
		m.addAttribute("x",x);
		m.addAttribute("y",y);
		return "Bai2/Path";
	}
}
