package com.psl.bean;

public class Address {
    
	private String city;
	private int zip;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public Address() {
	}
	public Address(String city,int zip) {
		this.city=city;
		this.zip=zip;
	}
	@Override
	public String toString() {
		return "City "+city+" ,Zip"+zip;
	}
}
