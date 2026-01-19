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
    private String photo;
    @Default
    private Boolean gender;

    @Default
    private Date birthday = new Date();

    @Default
    private Double salary;

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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Boolean getGender() {
		return gender;
	}
	public void setGender(Boolean gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
    
}
