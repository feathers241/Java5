package com.example.lab3.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder.Default;

@NoArgsConstructor 
@AllArgsConstructor 
@Builder
@Data 
public class Staff {
	
// LOMBOK
	private String id;
	private String fullname;
	
	@Default
    private String photo = "a";

    @Default
    private Boolean gender = true;

    @Default
    private Date birthday = new Date();

    @Default
    private Double salary = 12345.6789;

    @Default
    private Integer level = 0;
    
    public Staff(String a, String b, String c, Boolean d, Date e, Double salary, Integer f) {
    	this.id = a;
    	this.fullname = b;
    	this.photo = c;
    	this.gender = d;
    	this.salary =salary;
    	this.birthday = e;
    	this.level = f;
    }
    public Staff() {}

}
