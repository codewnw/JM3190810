package com.jm3190810.hibernate.pk.table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SequenceApp {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(StudentTable.class).buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();

		try {
			// begin the transaction
			session.beginTransaction();

			// perform the transaction
			StudentTable student = new StudentTable();
			student.setName("Venu Gopal Krishna");
			student.setAge(200);
			long pk = (Long) session.save(student);
			System.out.println("Student PK is: " + pk);

			// commit the transaction
			session.getTransaction().commit();

		} finally {
			sessionFactory.close();
		}

	}
}
