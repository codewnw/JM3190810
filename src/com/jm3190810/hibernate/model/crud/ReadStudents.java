package com.jm3190810.hibernate.model.crud;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jm3190810.hibernate.model.Student;

public class ReadStudents {
	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();

			List<Student> students = session.createQuery("from Student").getResultList();
			System.out.println(students);

			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}
	}
}
