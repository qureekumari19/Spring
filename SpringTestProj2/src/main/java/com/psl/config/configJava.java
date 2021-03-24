package com.psl.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.psl.beans.Address;
import com.psl.beans.Employee;

@Configuration
//@ComponentScan(basePackages = "com.psl.beans")
public class configJava {
	
	@Bean("empl")
	@Scope(value = "prototype")       //To create new address for very object however content can be same
	@Lazy
	 public Employee getEmployee()
	 {
		/*Employee e=new Employee();
		e.setName("quree");
		e.setId(765);
		return e;*/
		 return new Employee(123, "Quree",getAddress2());
	 }
	@Bean("addr3")
	 public Address getAddress()
	 {
		 return new Address("pune","gali", "qjeikj3iui");
	 }
	@Bean("addr1")
	 public Address getAddress2()
	 {
		 return new Address("Bagodar","Chandani Chowk", "iui");
	 }
}
