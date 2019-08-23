package com.ict.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ict.dao.studentdao;
import com.ict.model.Student;
import com.ict.service.studentservice;

@Component
public class studentserviceimpl implements studentservice{
	
	@Autowired
	private studentdao studentdao;
	


	@Override
	public boolean addstudent(Student student) throws Exception {
		return this.studentdao.addstudent(student);
	}



	@Override
	public <T> List<T> getListByColumnAndValues(Class<T> t, String field,
			String... value) throws Exception {
		return studentdao.getListByColumnAndValues(t, field, value);
	}
	

}
