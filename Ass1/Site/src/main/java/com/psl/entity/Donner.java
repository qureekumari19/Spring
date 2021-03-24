package com.psl.entity;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.springframework.lang.NonNull;

public class Donner {
    @NonNull    
	private int id;
    @Email
	private String email;
    @Size(min = 1,max = 15 , message = "Name could be between 1 and 15 characters")
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Donner [id=" + id + ", email=" + email + ", name=" + name + "]";
	}	
	public Donner() {
	}
}
