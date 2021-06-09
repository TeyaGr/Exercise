package com.example.hibernateAnnotations;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Factory;

/**
 * Hello world!
 *
 */
public class App 
{
	static SessionFactory factory ;

	public static void main(String[] args) {
		Transaction tx = null;
		try {
			Configuration cfg = new Configuration();
			cfg.addAnnotatedClass(com.example.hibernateAnnotations.Employee.class);
			cfg.configure();
			factory = cfg.configure().buildSessionFactory();
			Session session = factory.openSession();
			

		} catch (HibernateException e) {
			System.out.println(e);
			tx.rollback();
		} 
	}
}


