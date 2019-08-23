package com.ict.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ict.model.Student;

@Component
public interface studentdao {
	
	public boolean addstudent(Student student) throws Exception;
	
	<T> List<T> getListByColumnAndValues(Class<T> t, String field,
			String... value) throws Exception;

}
