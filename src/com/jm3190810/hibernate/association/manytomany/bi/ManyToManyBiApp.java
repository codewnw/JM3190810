package com.jm3190810.hibernate.association.manytomany.bi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManyToManyBiApp {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Person.class).addAnnotatedClass(Address.class).buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();

		try {
			// begin the transaction
			session.beginTransaction();

			Person p1 = new Person("Rohit");
			Person p2 = new Person("Virat");
			
			Address a1 = new Address("BLR");
			Address a2 = new Address("NDLS");
			Address a3 = new Address("HYD");
			
			p1.addAddress(a1);
			p1.addAddress(a2);
			
			p2.addAddress(a2);
			p2.addAddress(a3);
			
			session.save(a1);
			session.save(a2);
			session.save(a3);
			
			
			

			// commit the transaction
			session.getTransaction().commit();

		} finally {
			sessionFactory.close();
		}

	}
}
