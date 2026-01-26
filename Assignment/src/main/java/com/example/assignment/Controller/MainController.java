package com.example.assignment.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller	
public class MainController {
	
	@GetMapping({"/", "/index"})
    public String home(Model model) {
//		model.addAttribute("content", "User/MainProduct :: content");
        return "User/index";
    }

    @GetMapping("/products")
    public String products() {
        return "User/products";
    }

    @GetMapping("/about")
    public String about() {
        return "User/about";
    }

    @GetMapping("/login")
    public String login() {
        return "User/login";
    }

    @GetMapping("/cart")
    public String cart() {
        return "User/cart";
    }
    @GetMapping("/MainProduct")
    public String product(Model model) {
        return "User/MainProduct";
    }

    @GetMapping("/voucher")
    public String voucher(Model model) {
        return "User/voucher";
    }
    @GetMapping("/Admin/index")
    public String adminidex() {
    	return "Admin/index";
    }

}
