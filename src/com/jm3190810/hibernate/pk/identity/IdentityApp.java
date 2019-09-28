package com.jm3190810.hibernate.pk.identity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class IdentityApp {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(StudentIdentity.class).buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();

		try {
			// begin the transaction
			session.beginTransaction();

			// perform the transaction
			StudentIdentity student = new StudentIdentity();
			student.setName("Venu Gopal");
			student.setAge(100);
			long pk = (Long) session.save(student);
			System.out.println("Student PK is: " + pk);

			// commit the transaction
			session.getTransaction().commit();

		} finally {
			sessionFactory.close();
		}

	}
}
