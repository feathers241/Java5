package com.example.lab3.bai1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class CookieService {
	@Autowired
	HttpServletRequest request;
	@Autowired
	HttpServletResponse response;
	
	//Đọc cookie từ request
	public Cookie get(String name) {
		Cookie[] cookie = request.getCookies();
		for(Cookie c : cookie) {
			if(c.getName().equals(name)) {
				return c; 
			}
		}
		return null;
	}
	
	//Đọc giả trị của cookie từ request
	public String value(String name) {
		Cookie c = get(name);
		return c != null ? c.getValue() : null;
	}
	
	//Tạo và gửi cookie về client
	public Cookie add(String name, String value, int hour) {
		Cookie cookie = new Cookie(name,value);
		cookie.setMaxAge(hour);
		cookie.setPath("/");
		response.addCookie(cookie);
		return cookie;
	}
	
	public Cookie delete(String name) {
		Cookie cookie = get(name);
		cookie.setMaxAge(0);
		response.addCookie(cookie);
		return cookie;
	}
}
