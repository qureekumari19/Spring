package com.psl.data;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("bok")
public class Book {
	//@Value("74859")
	private int bookid;
	//@Value("Maven-Spring")
	private String name;
	public int getBookid() {
		System.out.println("Book getter to get Book_Id");
		return bookid;
	}
	public void setBookid(int bookid) {
		System.out.println("Book setter to set Book_Id");
		this.bookid = bookid;
	}
	public String getName() {
		System.out.println("Book getter to get Book name");
		return name;
	}
	public void setName(String name) {
		System.out.println("Book setter to set Book name");
		this.name = name;
	}
	public Book() {
		System.out.println("Nonparamerised constructor");
	}
	public Book(String name,int bookid)
	{
		this.bookid=bookid;
		this.name=name;	   
	}
	public String toString()
	{
		return "[Book_Id: "+bookid+" Book_Name: "+name+" ]";
	}
}
