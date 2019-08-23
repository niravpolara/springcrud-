package com.ict.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ict.dao.studentdao;
import com.ict.model.Student;

@Component
@Repository
public class studentdaoimpl implements studentdao {
	
	@Autowired
	private SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Override
	public boolean addstudent(Student student) throws Exception {
		Session session = null;
		Transaction tx = null;
		boolean flag = false;
		try {
			session = getSessionFactory().openSession();
			tx = session.beginTransaction();
			session.save(student);
			if(tx!=null){
				tx.commit();
				flag = true;
			}
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return flag;
	}
	
	@Override
	public <T> List<T> getListByColumnAndValues(Class<T> c, String field,
			String... value) throws Exception {

		StringBuilder can = new StringBuilder("");
		Session session = null;
		List<T> t = null;
		try {
			for (int ind = 0; ind < value.length; ind++) {
				can.append(field + "='" + value[ind] + "' OR ");
			}

			String c_name = c.getSimpleName();

			session = this.getSessionFactory().openSession();

			String hql = "from " + c_name + " where "
					+ can.substring(0, can.length() - 3) + " order by " + field
					+ " asc ";
			Query query = session.createQuery(hql);
			t = query.list();
		} catch (Exception e) {
		} finally {
			session.close();
		}
		return t;

	}
	
	

}
