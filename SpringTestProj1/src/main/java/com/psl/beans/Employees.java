package com.psl.beans;

public class Employees {
    private int id;
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	private String name;
    private Address addr;
    
    public Employees(int id,String name,Address addr)
    {
    	this.addr=addr;
    	this.id=id;
    	this.name=name;
    }
    public Employees() {
	}
    public String toString()
    {
    	return addr+" "+id+" "+name;
    }
}
