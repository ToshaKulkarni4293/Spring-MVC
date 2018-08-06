package com.tosha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tosha.model.Student;
import com.tosha.service.Studentservice;

@Controller

@RequestMapping("/home")
public class StudentController {
	@Autowired
	private Studentservice studentse;
	@RequestMapping(value="/student",method = RequestMethod.GET)
    public String newRegistration(ModelMap model) {
        //Student student = new Student();
        model.addAttribute("student", studentse.getmessage());
        return "result";
    }

 
}
