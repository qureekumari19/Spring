package com.psl.entity;

import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class BloodDonnerDetails {
   
//	@Size(min = 9,message = "Please enter valid PhoneNumber of min 9 digit")
//	@NotNull
	private String phone_number;
//	@Min(value = 10 ,message = "Please enter valid Address" )
	private String address;
//	@Size(min = 3,max = 20 , message = "Name should be between 3 to 30 letters only")
	private String name;
//	@NotNull
	private String bd;
	public String getBd() {
		return bd;
	}
	public void setBd(String bd) {
		this.bd = bd;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
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
    public BloodDonnerDetails(String name,String address,String bd,String phone_number) {
		this.address=address;
		this.name=name;
		this.bd=bd;
		this.phone_number=phone_number;
	}

}
