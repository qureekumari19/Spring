package com.psl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.beans.Employees;

public class App {
   public static void main(String[] args) {
	   ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
	   Employees e=ctx.getBean("emp",Employees.class);
	   System.out.println(e);
    }
}
