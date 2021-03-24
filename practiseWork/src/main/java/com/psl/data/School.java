package com.psl.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("schl")
public class School {
	//@Value("DAV")
     private String scl_name;
	//@Value("46566")
     private int res_code;
//     @Autowired
//     @Qualifier("book1")     
     private Book book;
     public String getName() {
    		System.out.println("School getter to get School name");
		return scl_name;
	}
	public void setName(String name) {
		System.out.println("School setter to set School name");
		this.scl_name = name;
	}
	public int getRes_code() {
		System.out.println("School getter to get Registration_Code");
		return res_code;
	}
	public void setRes_code(int res_code) {
		System.out.println("School setter to set Registration_Code");
		this.res_code = res_code;
	}
	public Book getBook() {
		System.out.println("School getter to get book");
		return book;
	}
	public void setBook(Book book) {
		System.out.println("School setter to set book");
		this.book = book;
	}	
     public School() {
		System.out.println("Nonparamerised constructor");
	}
     public School(String name,int res_code,Book book)
     {
    	 this.book=book;
    	 this.scl_name=name;
    	 this.res_code=res_code;
     }
     public String toString()
     {
    	 return "School: [Name: "+scl_name+" Registration_code: "+res_code+" ]"+"\nBook: "+book;
     }
     
}
