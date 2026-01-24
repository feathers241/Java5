package com.example.lab4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.example.lab4.entity.Staff;

@Controller
@RequestMapping("/Bai2")
public class Bai2Controller {
	@RequestMapping() 
	public String createForm(Model model, @ModelAttribute("staff") Staff staff) { 
	model.addAttribute("message", "Vui lòng nhập thông tin nhân viên!"); 
	return "/Bai2/form"; 	
	} 
	@RequestMapping("/staff/create/save") 
	public String createSave(Model model, @Validated @ModelAttribute("staff") Staff staff, Errors errors,  
	@RequestPart("photo_file") MultipartFile photoFile) { 
	// Gán tên file upload cho thuộc tính photo của bean nếu có upload file 
	if(!photoFile.isEmpty()) { 
	staff.setPhoto(photoFile.getName());  
	} 
	if(errors.hasErrors()) { 
		  model.addAttribute("message", "Vui lòng sửa các lỗi sau!");
	} else { 
		  model.addAttribute("message", "Dữ liệu đã nhập đúng!"); 
	 } 

	return "/Bai2/form"; 
	}
}
