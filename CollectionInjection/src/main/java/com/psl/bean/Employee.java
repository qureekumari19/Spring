package com.psl.bean;

public class Employee {
  
	 private String name;
	 private int id;
	 private String email;
	 private Address addr;
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String name,int id,String email,Address addr)
	{
		this.name=name;
		this.id=id;
		this.email=email;
		this.addr=addr;
	}
	public String toStrng() {
       return "name: "+name+" ,id"+id+" ,email: "+email+" ,Address "+addr; 

	}
} 
