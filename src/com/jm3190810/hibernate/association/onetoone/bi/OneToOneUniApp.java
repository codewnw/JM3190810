package com.jm3190810.hibernate.association.onetoone.bi;

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
			engine.setCar(car);
			car.setEngine(engine);

			session.save(engine);
			System.out.println("Engine and car inserted successfully.");			
		*/
			
			/*
			Engine engine = session.get(Engine.class, 1L);
			System.out.println(engine);
			System.out.println(engine.getCar());
			*/
			
		/*	
			Engine engine = session.get(Engine.class, 1L);
			Car car = engine.getCar();
			engine.setName("Tata");
			car.setName("BMW");
			*/
			
			
			Engine engine = session.get(Engine.class, 1L);
			session.delete(engine);
			
			
			// commit the transaction
			session.getTransaction().commit();

		} finally {
			sessionFactory.close();
		}

	}
}
