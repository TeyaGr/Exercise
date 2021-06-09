package com.example.hibernateEx;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//1. Otvarame standard service registry
StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
// 2 otvarame metadata
Metadata md = new MetadataSources(ssr).getMetadataBuilder().build();
// 3. Otvarame session factory
SessionFactory factory = md.getSessionFactoryBuilder().build();
// 4. Otvarame sesija
Session session = factory.openSession();
//5 otvarame transakcija
Transaction t = session.beginTransaction();


//i sega pravime objekt od klasata/tabelata

Employee emp1 = new Employee (1,"Tea","Gromnabovska", 50000);
// Da se zachuva objektot
session.save(emp1);
t.commit();
System.out.println("Succesfully inserted");
// Moradasezatvori sesijata i factory-to
factory.close();
session.close();

    }
}
