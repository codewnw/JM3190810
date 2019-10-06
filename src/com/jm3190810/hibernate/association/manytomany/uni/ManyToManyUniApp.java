package com.jm3190810.hibernate.association.manytomany.uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManyToManyUniApp {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Person.class).addAnnotatedClass(Address.class).buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();

		try {
			// begin the transaction
			session.beginTransaction();

			Address add1 = new Address("Addrr 1");
			Address add2 = new Address("Addrr 2");
			Address add3 = new Address("Addrr 3");

			Person person1 = new Person("Rohit");
			Person person2 = new Person("Virat");

			person1.addAddress(add1);
			person1.addAddress(add2);

			person2.addAddress(add2);
			person2.addAddress(add3);
			
			session.save(person2);
			

			// commit the transaction
			session.getTransaction().commit();

		} finally {
			sessionFactory.close();
		}

	}
}
