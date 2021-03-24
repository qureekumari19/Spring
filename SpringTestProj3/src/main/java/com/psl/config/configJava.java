package com.psl.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;

import com.psl.beans.Address;
import com.psl.beans.Employee;

@Configuration
@ComponentScan(basePackages = "com.psl.beans")
@PropertySource("classpath:env.properties")
public class configJava {

	@Autowired
	private Environment env12;
	
	@Value("${e.id}")
	private int id;	
	@Value("${e.name}")
	private String name;
	@Value("${e.city}")
	private String  city;
	@Value("${e.street}")
	private String street;
	@Value("${e.zip}")
	private String zip;

	@Bean("employee")
	//@Scope(value = "prototype")       //To create new address for very object however content can be same
	@Lazy
	public Employee getEmployee()
	{
		Employee e=new Employee();
		e.setId(id);
		e.setName(name);
//		e.setAddr(getAddress());
		//		e.setName("quree");
		//		e.setId(765);
		return e;
		// return new Employee(123, "Prabhat",getAddress2());
	}
	@Bean("addr3")
	public Address getAddress()
	{
		//return new Address("pune","gali", "qjeikj3iui");
		return new Address(env12.getProperty("e.city"),env12.getProperty("e.street"),env12.getProperty("e.zip"));
	}
	@Bean("addr1")
	public Address getAddress2()
	{
		return new Address("Bagodar","Chandani Chowk", "iui");
	}
}
