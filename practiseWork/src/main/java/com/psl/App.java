package com.psl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.Config.Config;
import com.psl.data.School;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);
        //ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
        School sc=ctx.getBean("schl",School.class);
       // School sc1=ctx.getBean("schl",School.class);
        //System.out.println(sc.equals(sc1));
        System.out.println(sc);
    }
}
