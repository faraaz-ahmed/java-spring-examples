package com.demo.client;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.entity.Emp;

@Repository("jpa-app") //overriding the default naming convention, this is the bean name which we will be using
@Transactional //used to implement AOP
public class EmpJpaDao {

	@PersistenceContext
	private EntityManager em;
	
	public String saveEmp(Emp e) {
		em.persist(e);
		return "Employee data saved successfully!";
	}
	
	public void findEmp(int id) {
//		System.out.println(id)
		Emp e = em.find(Emp.class, id);
		System.out.println("The required employee name is "+e.getName()+"for the id :"+id);
	}
}
