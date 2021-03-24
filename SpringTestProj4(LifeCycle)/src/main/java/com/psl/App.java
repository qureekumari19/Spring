package com.psl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.psl.beans.Employee;
import com.psl.config.Config;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{		
//		ApplicationContext con=new AnnotationConfigApplicationContext(Config.class);
//		Employee e=con.getBean("emp",Employee.class);
//		System.out.println(e);
		AnnotationConfigApplicationContext con=new AnnotationConfigApplicationContext(Config.class);
		con.close();
	}
}
