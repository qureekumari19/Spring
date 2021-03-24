package com.psl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan(basePackages = "com.psl.*")
@EnableWebMvc
public class Config {

	@Bean
	public InternalResourceViewResolver resolver() {
		InternalResourceViewResolver rs=new InternalResourceViewResolver();
		rs.setViewClass(JstlView.class);
		rs.setPrefix("/WEB-INF/views/");
		rs.setSuffix(".jsp");
		return rs;		
	}
}
