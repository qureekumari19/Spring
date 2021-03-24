package com.psl.beans;

import org.springframework.stereotype.Component;

//@Component("addr")
public class Address {
	 private String  city;
	    public String getCity() {
			return city;
		}
		public void setCity(String city) {
			System.out.println("Address city has taken");
			this.city = city;
		}
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			System.out.println("Address street has taken");
			this.street = street;
		}
		public String getZip() {
			return zip;
		}
		public void setZip(String zip) {
			System.out.println("Address zip has taken");
			this.zip = zip;
		}		
		private String street;
	    private String zip;
	    public String toString()
	    {
		  return "City: "+city+" Street: "+street+" Zip: "+zip; 	
		}
	    public Address(String city, String street, String zip)
	    {
	    	System.out.println("Address Parameterised constructor called");
	    	this.city=city;
	    	this.street=street;
	    	this.zip=zip;
	    }
	    public Address() {
	    	System.out.println("Address NonParameterised constructor called");
		}
}
