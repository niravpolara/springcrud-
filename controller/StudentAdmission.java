package com.ict.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.ict.customeclass.GeneralDto;
import com.ict.model.Student;
import com.ict.service.studentservice;

@EnableWebMvc
@Controller
@RequestMapping(value="student")
public class StudentAdmission {
	public static final String Y="Y";
	
	@Autowired
	public studentservice studentservice;

	@RequestMapping(value="studentregistration")
	public ModelAndView studentregistration(){
		return new ModelAndView("AdmissionForm");
	}
	
	
	@RequestMapping(value="submitaddmissionform")
	public ModelAndView submitaddmissionform(@ModelAttribute("generalmodel")GeneralDto general,
			HttpServletRequest request,HttpServletResponse response) throws Exception
	{	
		Student student=general.getStudent();
		student.setStatus("Y");
		boolean flag=studentservice.addstudent(student);
		return new ModelAndView("submitaddmissionform");
	}
	
	@RequestMapping(value="employeelist")
	public ModelAndView employeelist(@ModelAttribute("generalmodel")GeneralDto general,HttpServletRequest request,HttpServletResponse response) throws Exception{
		
		List<Student> list=studentservice.getListByColumnAndValues(Student.class, "status", Y);
		request.setAttribute("studentlist", list);
		
		return new ModelAndView("employeelist");
	}

}
