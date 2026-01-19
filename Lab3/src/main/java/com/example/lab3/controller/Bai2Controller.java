package com.example.lab3.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.lab3.entity.Staff;

@Controller
@RequestMapping("/Bai2")
public class Bai2Controller {
	@GetMapping()
	public String temp(Model model) {
		Date date = new Date();
		List<Staff> list = List.of(
					new Staff("007","Nguyễn Văn James ","Dog.jpg",true,date,30000.123,0),
					new Staff("001","Nguyễn Văn  Bond","Dog.jpg",true,date,30000.123,0),
					new Staff("002","Nguyễn Văn James Bond","Dog.jpg",true,date,30000.123,0),
					new Staff("003","Nguyễn  James Bond","Dog.jpg",true,date,30000.123,0),
					new Staff("004"," Văn James Bond","Dog.jpg",true,date,30000.123,0),
					new Staff("008","Nguyễn  Bond","Dog.jpg",true,date,30000.123,0),
					new Staff("005","Nguyễn Văn Huỳnh James ","Dog.jpg",true,date,30000.123,0)
				);
		model.addAttribute("list",list);
		return "Bai2/fom";
	}
}
