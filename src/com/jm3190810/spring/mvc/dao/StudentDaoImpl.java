package com.jm3190810.spring.mvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jm3190810.spring.mvc.entity.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public void save(Student student) {
		System.out.println("In DAO");
		sessionFactory.getCurrentSession().save(student);
	}

	@Override
	@Transactional
	public Student get(long id) {
		return sessionFactory.getCurrentSession().get(Student.class, id);
	}

	@Override
	@Transactional
	public void delete(long id) {
		Session session = sessionFactory.getCurrentSession();
		Student student = session.get(Student.class, id);
		session.delete(student);
	}

	@Override
	@Transactional
	public void update(Student student) {
		sessionFactory.getCurrentSession().saveOrUpdate(student);
	}

	@Override
	@Transactional
	public List<Student> all() {
		return sessionFactory.getCurrentSession().createQuery("from Student").getResultList();
	}

}
