package com.jm3190810.hibernate.association.onetoone.uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToOneUniApp {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Car.class)
				.addAnnotatedClass(Engine.class).buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();

		try {
			// begin the transaction
			session.beginTransaction();

			/*
			Engine engine = new Engine("Ford", 400);
			Car car = new Car("Audi", "black");
			car.setEngine(engine);

			session.save(car);
			System.out.println("Car and engine inserted successfully.");			
		*/
			
			/*
			Car car = session.get(Car.class, 1L);
			System.out.println(car);
			*/
			
			/*
			Car car = session.get(Car.class, 1L);
			Engine e = car.getEngine();
			e.setName("Tata");
			car.setColor("Red");
			*/
			
			Car car = session.get(Car.class, 1L);
			session.delete(car);
			
			// commit the transaction
			session.getTransaction().commit();

		} finally {
			sessionFactory.close();
		}

	}
}
