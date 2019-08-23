package com.ict.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ict.model.Student;

@Component
public interface studentservice {
	
	public boolean addstudent(Student student) throws Exception;
	
	<T> List<T> getListByColumnAndValues(Class<T> c, String field,
			String... value) throws Exception;
	

}
