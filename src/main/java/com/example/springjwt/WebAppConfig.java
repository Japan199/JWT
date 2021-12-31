package com.example.springjwt;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
// this class is used to load all the jsp pages as well as it scans all the packages
@Configuration
@ComponentScan({"com.example.springjwt"})
public class WebAppConfig {
	@Bean
	public InternalResourceViewResolver viewResolver() {
		
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
	
		vr.setPrefix("/WEB-INF/jsp/");
		vr.setSuffix(".jsp");
//		
		return vr;
	}
}
