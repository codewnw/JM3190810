package com.jm3190810.hibernate.model.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jm3190810.hibernate.model.Student;

public class DeleteStudent {
	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();

			Student student = session.get(Student.class, 2L);
			session.delete(student);

			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}
	}
}
