package com.psl.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyProc implements BeanPostProcessor {
 
	public Object postProcessBeforeInitialization(Object bean,String BeanName) throws BeansException
	{
		System.out.println("pre init for BeanPosTProcessor "+BeanName);
		return bean;
	}
	public Object postProcessAfterInitialization(Object bean,String BeanName) throws BeansException
	{
		System.out.println("post init for BeanPosTProcessor "+BeanName);
		return bean;
	}
}
