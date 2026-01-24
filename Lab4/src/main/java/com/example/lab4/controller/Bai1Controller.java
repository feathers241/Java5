package com.example.lab4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.example.lab4.entity.Staff;

@Controller
@RequestMapping("/Bai1")
public class Bai1Controller {
	@RequestMapping() 
	public String createForm(Model model, @ModelAttribute("staff") Staff staff) { 
	model.addAttribute("message", "Vui lòng nhập thông tin nhân viên!"); 
	return "/Bai1/form"; 
	} 
	@RequestMapping("/staff/create/save") 
	public String createSave(Model model, @ModelAttribute("staff") Staff staff,  
	@RequestPart("photo_file") MultipartFile photoFile) { 
	// Gán tên file upload cho thuộc tính photo của bean nếu có upload file 
	if(!photoFile.isEmpty()) { 
	staff.setPhoto(photoFile.getName());  
	} 
	model.addAttribute("message", "Xin chào " + staff.getFullname()); 
	return "/Bai1/form"; 
	} 
}
