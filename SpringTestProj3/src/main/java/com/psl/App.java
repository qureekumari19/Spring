package com.psl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.beans.Employee;
import com.psl.config.configJava;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		// ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext ctx=new AnnotationConfigApplicationContext(configJava.class);
		Employee e=ctx.getBean("employee",Employee.class);
		// Employee e1=ctx.getBean("employee",Employee.class);
		System.out.println(e);
		//System.out.println(e1);
		System.out.println(e.hashCode());
		//System.out.println(e1.hashCode());
	}
}
