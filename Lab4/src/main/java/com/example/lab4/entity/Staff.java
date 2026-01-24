package com.example.lab4.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
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
	 @NotBlank(message = "Chưa nhập email") 
	 @Email(message = "Email không đúng định dạng") 
	private String id;
	 @NotBlank(message = "Chưa nhập họ và tên")
	 private String fullname;

	
	@Default
    private String photo;
	@NotNull(message = "Chưa chọn giới tính")
    private Boolean gender;

	@NotNull(message = "Chưa nhập ngày sinh") 
	 @Past(message = "Ngày sinh không hợp lệ") 
	 @DateTimeFormat(pattern = "MM/dd/yyyy") 
    private Date birthday = new Date();

	@Min(value = 1000, message = "Lương tối thiểu phải là 1000") 
	 @NotNull(message = "Chưa nhập lương")
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
