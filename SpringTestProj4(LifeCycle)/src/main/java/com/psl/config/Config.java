package com.psl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.psl.beans.Employee;
import com.psl.beans.MyProc;
import com.psl.beans.TestBean;

@Configuration
public class Config {
     @Bean("emp")
	 public Employee getEmployee()
	 {
    	 Employee e=new Employee();
    	 e.setId(1);
    	 e.setName("quree");
    	 return e;
//		 return new Employee(1,"quree");
	 }
     
}
