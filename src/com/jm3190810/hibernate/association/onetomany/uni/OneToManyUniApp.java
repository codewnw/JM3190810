package com.jm3190810.hibernate.association.onetomany.uni;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToManyUniApp {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Assignment.class).addAnnotatedClass(Course.class).buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();

		try {
			// begin the transaction
			session.beginTransaction();

			/*
			Assignment assign1 = new Assignment("Basic assignment");
			Assignment assign2 = new Assignment("Advance assignment");

			List<Assignment> assignments = new ArrayList<>();
			assignments.add(assign1);
			assignments.add(assign2);

			Course course = new Course("Frameworks");
			course.setAssignements(assignments);

			session.save(course);
			*/

			/*
			Course course = session.get(Course.class, 1L);
			System.out.println(course);
			*/
			
			/*
			Course course = session.get(Course.class, 1L);
			course.setName("Java Frameworks");
			course.getAssignements().get(0).setName("very basic assignment");
			*/
			
			Course course = session.get(Course.class, 1L);
			session.remove(course);

			// commit the transaction
			session.getTransaction().commit();

		} finally {
			sessionFactory.close();
		}

	}
}
