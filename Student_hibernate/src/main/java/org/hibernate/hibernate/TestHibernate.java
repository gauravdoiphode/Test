package org.hibernate.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestHibernate {

	public static void main(String[] args) {
		
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		
		Student student = new Student();
		student.setName("Avinash");
		student.setCity("Des Moines");
		student.setZip("50266");
		
		session.beginTransaction();
		
		session.save(student);
		
		session.getTransaction().commit();
		
		session.close();

	}

}
