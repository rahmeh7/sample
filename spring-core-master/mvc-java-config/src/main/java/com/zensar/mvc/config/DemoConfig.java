package com.zensar.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.zensar.mvc")
@EnableWebMvc
public class DemoConfig {
	
	@Bean
	public ViewResolver getViewResolver() {
		
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		
		viewResolver.setPrefix("/WEB-INF/views/");
		
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}

}
