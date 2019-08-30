package com.demo.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.demo.customer.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	@Transactional
	@Modifying
	@Query("delete from Customer c where c.email = ?1")
    void deleteCustomersByEmail(String firstName);
}
