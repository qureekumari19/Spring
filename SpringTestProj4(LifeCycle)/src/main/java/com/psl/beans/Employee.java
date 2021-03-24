package com.psl.beans;

import java.nio.channels.ShutdownChannelGroupException;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Employee implements DisposableBean,InitializingBean,BeanFactoryAware,ApplicationContextAware{
	private int id;
	private String name;

	public int getId() {
		System.out.println("Get id of EmployeeId");
		return id;
	}
	public void setId(int id) {
		System.out.println("Set id of EmployeeId");
		this.id = id;
	}
	public String getName() {
		System.out.println("Get id of EmployeeName");
		return name;
	}
	public void setName(String name) {
		System.out.println("Set id of EmployeeName");
		this.name = name;
	}
	public Employee() {
		System.out.println("Nonparameterised constructor");
	}
	public String toString()
	{
		System.out.println("inside ToString method");
		return "id: "+id+" ,name: "+name;

	}
	public Employee(int id,String name) {
		System.out.println("Parameterised constructor");
		this.id=id;
		this.name=name;
	}
	public void setBeanName(String name) {
		System.out.println("In BeanNameAware.setBeanName the Bean name is "+name);
	}
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("In BeanFactory.setBeanFactory the Bean name is "+beanFactory);
		System.out.println();

	}
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {		
		System.out.println("In ApplicationContext.setApplicationContext the Bean name is "+applicationContext);
		System.out.println();
	}
	public void destroy() throws Exception {
		System.out.println("In desposableBean of destroy method");
		System.out.println();
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("In InitialisableBean of initialise method");
		System.out.println();
	}		
}
