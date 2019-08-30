package com.demo.client;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.entity.Customer;
//import com.demo.entity.Emp;

@Repository("jpa-app") //overriding the default naming convention, this is the bean name which we will be using
@Transactional //used to implement AOP
public class CustomerJpaDao {

	@PersistenceContext
	private EntityManager em;
	
	public String saveCustomer(Customer c) {
		em.persist(c);
		return "Customer data saved successfully!";
	}
	
	public void findAccount(int id) {
//		System.out.println(id)
		Customer c = em.find(Customer.class, id);
		System.out.println("The required employee name is "+c.getCustomerName()+"for the id :"+id);
	}
	
//	public void addAccount(Customer c) {
//		em.find(entityClass, primaryKey)
//	}
}
