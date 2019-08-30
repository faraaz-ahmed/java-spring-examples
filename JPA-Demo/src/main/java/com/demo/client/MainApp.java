package com.demo.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.entity.Dept;
import com.demo.entity.Emp;
import com.demo.spring.JpaConfig;


public class MainApp {
	public static void main(String[] args) {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql");
//		EntityManager em = emf.createEntityManager();
//		
//		
//		try {
//			em.getTransaction().begin();
//			Dept d = em.find(Dept.class, 20);
//			Emp e1 = new Emp(2022, "Vijaygg", "Hampidfsd", 354000);
//			Emp e2 = new Emp(2033, "Rakesdvdh", "dsvBangalore", 538000);
//			
//			e1.setDept(d);
//			e2.setDept(d);
//			
//			em.persist(e1);
//			em.persist(e2);
//			em.getTransaction().commit();
//		}catch (Exception e){
//			e.printStackTrace();
//			em.getTransaction().rollback();
//		} finally {
//			em.close();
//		}
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JpaConfig.class);
		EmpJpaDao dao = (EmpJpaDao) ctx.getBean("jpa-app");
		dao.findEmp(200);
		dao.saveEmp(new Emp(300,"Narendra","Delhi",30000));
	}

}
