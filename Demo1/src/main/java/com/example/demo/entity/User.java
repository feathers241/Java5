package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class User {
	String username;
	String password;	
	
	public User(String a,String b) {
		this.username = a;
		this.password = b;
	}
	
	
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public static void main(String[] args) {
		User u = new User("a", "b");
		System.out.println(u.getUsername());
	}

}
