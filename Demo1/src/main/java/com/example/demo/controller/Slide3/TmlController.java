package com.example.demo.controller.Slide3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.entity.User;

@Controller
public class TmlController {
	
	@GetMapping("/menu" )
	public String menu() {
		return "learnThymeleaf/menu";
	}
	
	@GetMapping("/demo1")
	public String name(Model model) {
		model.addAttribute("year","2026");
		model.addAttribute("name","Tùng");
		return "learnThymeleaf/testThymeleaf";
	}
	
	@GetMapping("/demo2")
	public String function(Model model) {
		model.addAttribute("today",new Date());
		return "learnThymeleaf/Functions";
	}
	
	@ModelAttribute("users")
	public List<User> data() {
		List<User> userList = new ArrayList<>();
		userList.add(new User("Nguyễn Văn A","aaa"));
        userList.add(new User("Trần Thị B","bbb"));
        userList.add(new User("Lê Văn C","ccc"));
        userList.add(new User("Phạm Minh D","ddd"));
        return userList;
	}
}

