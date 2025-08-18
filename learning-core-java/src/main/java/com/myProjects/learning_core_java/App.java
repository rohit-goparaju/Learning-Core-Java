package com.myProjects.learning_core_java;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	public static Logger log = LoggerFactory.getLogger(App.class);
	
    public static void main( String[] args )
    {
    	
    	Configuration config = new Configuration().configure();
    	SessionFactory sf = config.buildSessionFactory();
    	Session s = sf.openSession();
    	
    	Transaction tx = s.beginTransaction();
    	
//    	Person p = new Person();
//    	
//    	Person p1 = new Person();
//    	
//    	Smartphone s1 = new Smartphone(1, "Rohit's S25 Ultra", p);
//    	Smartphone s2 = new Smartphone(2, "Ammi's iphone", p1);
//    	
//    	Address a1 = new Address();
//    	a1.setId(1);
//    	a1.setAddress("India");
//    	a1.addPerson(p);
//    	a1.addPerson(p1);
//    	
//    	Address a2 = new Address();
//    	a2.setId(2);
//    	a2.setAddress("USA");
//    	a2.addPerson(p);
//
//
//    	
//    	p.setId(1);
//    	p.setName("Rohit");
//    	p.setSpouse(p1);
//    	p.addSmartphone(s1);
//    	p.addAddress(a1);
//    	p.addAddress(a2);
//    	
//    	p1.setId(2);
//    	p1.setName("Ammi");
//    	p1.setSpouse(p);
//    	p1.addSmartphone(s2);
//    	p1.addAddress(a1);
//    	
//    	s.persist(p);
//    	s.persist(p1);
//    	s.persist(s1);
//    	s.persist(s2);
//    	s.persist(a1);
//    	s.persist(a2);
//    	
    	
//    	Person p = new Person();
//    	
//    	s.load(p, 1);
    	
    	Query<Object[]> q = s.createQuery("from Person p right join p.addressList a where p.id > :myId", Object[].class);
    	q.setParameter("myId", 0);
    	
    	q.list().forEach(o->log.info(o[0]+ " " +o[1]+""));
    	
    	
    	tx.commit();
    	s.close();
    	sf.close();
    }
}
