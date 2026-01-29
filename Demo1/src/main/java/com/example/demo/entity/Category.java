package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "categories")
public class Category {
	
	@Id
	String id;
	
	@Column(columnDefinition = "nvarchar(50)")
	String name; 
	
	@Column(columnDefinition = "nvarchar(100)")
	String Description ;
	boolean active;
	
	public Category(String a, String b, String c, boolean d) {
		this.id = a;
		this.name = b;
		this.Description = c;
		this.active =d ;
	}
	
}
