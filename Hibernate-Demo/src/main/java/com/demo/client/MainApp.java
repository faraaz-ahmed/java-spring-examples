package com.demo.client;

//import javax.transaction.Transaction;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.entity.Dept;
import com.demo.entity.Emp;
import com.demo.entity.M;
import com.demo.entity.M1;

public class MainApp {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure(); //reads the hibernate.cfg.xml file
//		ServiceRegistry sr = new ServiceRegistryBuilder().applySet
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
//		try {
//			Emp e = new Emp(200, "faraaz", "hyderabad", 20000.0);
//			session.persist(e);
//			tx.commit();
//		}catch(HibernateException e) {
//			tx.rollback();
//		} finally {
//			session.close();
//		}
//		
//		try {
////			Emp e = new Emp(200, "faraaz", "hyderabad", 20000.0);
//			Dept d = new Dept(41, "Testing1", "Kamesh1");
//			session.persist(d);
//			tx.commit();
//		}catch(HibernateException e) {
//			tx.rollback();
//		} finally {
//			session.close();
//		}
		
//		try {
////			Emp e = new Emp(200, "faraaz", "hyderabad", 20000.0);
//			M m = new M(1, "hekko");
//			M1 m1 = new M1(2, "hello");
//			session.persist(m);
//			session.persist(m1);
//			tx.commit();
//		}catch(HibernateException e) {
//			tx.rollback();
//		} finally {
//			session.close();
//			sf.close();
//		}
		
		try {
//			Dept d = session.get(Dept.class, 30);
//			Emp e1 = new Emp(201, "Vijay", "Hampi", 34000);
//			Emp e2 = new Emp(202, "Rakesh", "Bangalore", 38000);
//			
//			e1.setDept(d);
//			e2.setDept(d);
			Emp e1 = new Emp(204,"assa","dss",43,new Dept(10, "str","sr"));
			
			session.persist(e1);
//			session.persist(e2);
			tx.commit();
		}catch(HibernateException e) {
			tx.rollback();
		} finally {
			session.close();
			sf.close();
		}
		
	}

}
