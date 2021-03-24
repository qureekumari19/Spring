package com.psl.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;

import com.psl.data.Book;
import com.psl.data.School;

@Configuration
@ComponentScan(basePackages = "com.psl.data")
@PropertySource("classpath:evn.properties")
public class Config {

	@Autowired
	Environment e;
	@Value("${s.scl_name}")
	private String scl_name;
	@Value("${s.res_code}")
	private int res_code;
	@Autowired
	@Qualifier("bok")   	   
	@Value("${b.bookid}")
	private int bookid;
	@Value("${b.name}")
	private String name;   
	@Scope(value ="prototype")
	@Lazy	
	@Bean("schl")
	public School getSchool()
	{
		School s1=new School();
		s1.setName(scl_name);
		s1.setRes_code(res_code);
		s1.setBook(getBook1());
		return s1;
		//return new School(scl_name,res_code,getBook());
	}
	@Bean("book1")
	public Book getBook1() {
//		Book b1=new Book();
		System.out.println("bok1 beans");
//		b1.setName(name);
//		b1.setBookid(bookid);
//		b1.setName("sankstrit");
//		b1.setBookid(12767);
		return new Book(e.getProperty("b.name"),Integer.parseInt(e.getProperty("b.bookid")));
//		return b1;
	}
	@Bean("book")
	public Book getBook() {
		Book b2=new Book();
		System.out.println("bok3 beans");
		b2.setName("Machine-Engineering");
		b2.setBookid(385680);
		return b2;
	}


}
