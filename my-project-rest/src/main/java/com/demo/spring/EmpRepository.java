package com.demo.spring;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.customer.entity.Emp;

public interface EmpRepository extends JpaRepository<Emp, Integer> {

}
