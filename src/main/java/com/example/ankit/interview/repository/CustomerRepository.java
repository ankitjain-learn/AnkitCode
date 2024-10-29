package com.example.ankit.interview.repository;

import com.example.ankit.interview.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findById(long Id);

}