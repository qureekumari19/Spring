package com.psl.config;

import java.awt.List;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.psl.bean.Address;
import com.psl.bean.Employee;
import com.psl.bean.TestBean;

@Configuration
public class Config {

	@Bean("list")
	public ArrayList<String> getList()
	{
		ArrayList<String> l=new ArrayList<String>();
		l.add("kali");
		return l;
	}
	
	@Bean("testbean")
	public TestBean getSet()
	{
		Set<String> s=new HashSet<String>();
		s.add("quree");
		s.add("q");
		return (TestBean) s;
	}
	@Bean("map")
	public Map<Integer, String> getMap()
	{
		Map<Integer, String> m=new HashMap<Integer, String>();
		m.put(1, "quree");
		m.put(2, "q");
		return m;
	}
	
	@Bean("employee")
	public Employee getEmployee()
	{
		return new Employee("quree",1,"qure@gmail.com",getAddr());
	}
	
	@Bean("addr")
	public Address getAddr() {
		// TODO Auto-generated method stub
		return new Address("Bangalore",13245);
	}
	
}
