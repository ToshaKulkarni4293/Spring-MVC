package com.tosha.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.tosha.service.Studentservice;
import com.tosha.service.StudentserviceImpl;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.tosha")
public class StudentConfiguration extends WebMvcConfigurerAdapter{
//Configure View Resolver
	@Bean
	public ViewResolver viewResolver()
	{
		InternalResourceViewResolver viewResolver= new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	} 
	@Bean
	public Studentservice studentserv()
	{
		return new StudentserviceImpl();
	}
	/*public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("messages");
		return messageSource;
	}
	
	public void addResourceHandlers(ResourceHandlerRegistry registry)
	{
		registry.addResourceHandler("/static/**").addResourceLocations("/static/");
	}*/
}

