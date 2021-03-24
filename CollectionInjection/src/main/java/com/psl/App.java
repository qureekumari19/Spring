package com.psl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.psl.bean.Employee;
import com.psl.bean.TestBean;
import com.psl.config.Config;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con=new AnnotationConfigApplicationContext(Config.class);
        Employee e=con.getBean("employee",Employee.class);
        System.out.println(e);
//        TestBean t=con.getBean("testbean",TestBean.class);
//        System.out.println(t);
    }
}
