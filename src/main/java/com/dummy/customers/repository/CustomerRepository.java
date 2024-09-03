package com.dummy.customers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dummy.customers.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // You can add custom query methods if needed
    Customer findByPhoneNo(String phoneNo);
    Customer findByEmail(String email);
}
