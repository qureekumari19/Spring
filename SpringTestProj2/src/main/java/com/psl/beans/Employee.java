package com.psl.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {	 
	//@Value("123")
	private int id;
	//@Value("quree")
	private String name;
	@Autowired
	@Qualifier("addr3")
	private Address addr;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("Employee id has taken");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Employee name has taken");
		this.name = name;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		System.out.println("Employee address has taken");
		this.addr = addr;
	}		
	public Employee(int id,String name,Address addr)
	{
		System.out.println("Employee Parameterised constructor called");
		this.addr=addr;
		this.id=id;
		this.name=name;
	}
	public Employee()
	{
		System.out.println("Employee NonParameterised constructor called");
	}
	public String toString()
	{
		return "Employee Id: "+id+" Name: "+name+"\n"+"Address "+addr;
	}
}
