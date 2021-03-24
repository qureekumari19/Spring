package com.psl.entity;

public class BloodDonnerDetails {
   
	private int phone_number;
	private String address;
	private String name;
	private String bd;
	public String getBd() {
		return bd;
	}
	public void setBd(String bd) {
		this.bd = bd;
	}
	public int getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "BloodDonnerDetails [phone_number=" + phone_number + ", address=" + address + ", name=" + name + ", bd="
				+ bd + "]";
	}
	public BloodDonnerDetails() {
		
	}
    public BloodDonnerDetails(String name,String address,String bd,int phone_number) {
		this.address=address;
		this.name=name;
		this.bd=bd;
		this.phone_number=phone_number;
	}

}
