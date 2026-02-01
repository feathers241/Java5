package com.example.lab6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.lab6.DAO.ProductDAO;
import com.example.lab6.Entity.Product;

@Controller
public class ProductController {
	@Autowired
	ProductDAO dao;
	@RequestMapping("/product/index")
	public String index(Model m) {
		Product item = new Product();
		m.addAttribute("item",item);
		List<Product> items = dao.findAll();
		m.addAttribute("items",items);
		return "product/index";
	}
	@RequestMapping("/product/edit/{id}") 
	 public String edit(Model model, @PathVariable("id") Integer id) { 
	Product item = dao.findById(id).orElse(null);
	  model.addAttribute("item", item); 
	  List<Product> items = dao.findAll(); 
	  model.addAttribute("items", items); 
	  return "product/index"; 
	 }
	 
	 @RequestMapping("/product/create") 
	 public String create(Product item) { 
	  dao.save(item); 
	  return "redirect:/product/index"; 
	 } 
	  
	 @RequestMapping("/product/update") 
	 public String update(Product item) { 
	  dao.save(item); 
	  return "redirect:/product/edit/" + item.getId(); 
	 } 
	 @RequestMapping("/product/delete/{id}") 
	 public String create(@PathVariable("id") Integer id) { 
	  dao.deleteById(id); 
	  return "redirect:/product/index"; 
	 } 
	 @GetMapping("/product/sort/price")
	 public String sortByPrice(Model model) {
	     Sort sort = Sort.by(Direction.ASC, "price");
	     List<Product> items = dao.findAll(sort);
	     model.addAttribute("items", items);
	     model.addAttribute("item", new Product());
	     return "product/index";
	 }
	 @GetMapping("/product/sort/price2")
	 public String sortByPrice2(Model model) {
	     Sort sort = Sort.by(Direction.DESC, "price");
	     List<Product> items = dao.findAll(sort);
	     model.addAttribute("items", items);
	     model.addAttribute("item", new Product());
	     return "product/index";
	 }
}
