package com.psl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.psl.bean.performer;
import com.psl.config.Config;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);
		performer p=ctx.getBean("performer",performer.class);
		p.perform();
	}
}
