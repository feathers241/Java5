package com.example.lab3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.lab3.entity.DB;

@Controller
public class ShoppingCartController {

    @Autowired 
    ShoppingCartService cart;

    @RequestMapping("/Bai5/2")
    public String view(Model model) {
        model.addAttribute("cart", DB.items.values());
        return "Bai5/index";
    }

    @RequestMapping("/Bai5/add/{id}")
    public String add(@PathVariable("id") Integer id) {
        cart.add(id);
        return "redirect:/Bai5/2";
    }

    @RequestMapping("/Bai5/remove/{id}")
    public String remove(@PathVariable("id") Integer id) {
        cart.remove(id);
        return "redirect:/Bai5/2";
    }

    @RequestMapping("/Bai5/update/{id}")
    public String update(
            @PathVariable("id") Integer id,
            @RequestParam("qty") Integer qty) {
        cart.update(id, qty);
        return "redirect:/Bai5/2";
    }

    @RequestMapping("/Bai5/clear")
    public String clear() {
        cart.clear();
        return "redirect:/Bai5/2";
    }
}
