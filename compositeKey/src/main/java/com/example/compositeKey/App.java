package com.example.compositeKey;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
	static SessionFactory factory;
    public static void main( String[] args )
    {
    	Transaction tx=null;
    	try {
			Configuration cfg =new Configuration();
			cfg.addAnnotatedClass(com.example.compositeKey.Employee.class);
			cfg.addAnnotatedClass(com.example.compositeKey.Phone.class);
			cfg.addAnnotatedClass(com.example.compositeKey.EmployeeId.class);
cfg.configure();
factory =cfg.configure().buildSessionFactory();
Session session=factory.openSession();

    	} catch (Exception e) {
}
    }
}
