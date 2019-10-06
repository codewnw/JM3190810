package com.jm3190810.hibernate.association.onetomany.bi;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToManyBiApp {
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
			Course course = new Course("Frameworks");
			
			course.addAssignement(assign1);
			course.addAssignement(assign2);
			
			session.save(course);
*/
			
			

			/*
			Assignment assignment = session.get(Assignment.class, 1L);
			System.out.println(assignment);
			System.out.println(assignment.getCourse());
			*/
			/*
			Assignment assignment = session.get(Assignment.class, 1L);
			assignment.setName("Simple");
			assignment.getCourse().setName("Popular Java Frameworks");
			*/
			Assignment assignment = session.get(Assignment.class, 1L);
			session.delete(assignment);

			// commit the transaction
			session.getTransaction().commit();

		} finally {
			sessionFactory.close();
		}

	}
}
