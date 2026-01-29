package com.example.lab3.bai1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Service
public class SessionService {
	@Autowired
	HttpSession session;
	
	//Lấy giả trị kiểu String 
//	public String get(String name) {
//		return String.valueOf(session.getAttribute(name));
//	}
	//Lấy giả trị kiểu bất kì
	public <T> T get(String name){
		return (T) session.getAttribute(name);
	}
	
	//Đổi giá trị
	public void set(String name, Object value) {
		session.setAttribute(name, value);
	}
	
	//Xóa Attribute
	public void delete(String name) {
		session.removeAttribute(name);
	}
}
