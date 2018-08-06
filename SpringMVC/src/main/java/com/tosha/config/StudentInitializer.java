package com.tosha.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class StudentInitializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContex) throws ServletException {
		AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext
        = new AnnotationConfigWebApplicationContext();
annotationConfigWebApplicationContext.register(StudentConfiguration.class);
annotationConfigWebApplicationContext.setServletContext(servletContex);

ServletRegistration.Dynamic servlet =
        servletContex.addServlet("dispatcher", new DispatcherServlet(annotationConfigWebApplicationContext));

servlet.setLoadOnStartup(1);
servlet.addMapping("/");
	// TODO Auto-generated method stub
		
	}


	}