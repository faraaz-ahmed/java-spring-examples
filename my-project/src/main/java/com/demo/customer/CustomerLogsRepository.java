package com.demo.customer;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.customer.entity.CustomerLogs;

public interface CustomerLogsRepository extends JpaRepository<CustomerLogs, Integer> {

}
