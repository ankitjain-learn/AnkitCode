package com.example.ankit.interview.service;

import com.example.ankit.interview.dto.CustomerResponse;
import com.example.ankit.interview.entity.Customer;
import com.example.ankit.interview.dto.CustomerRequest;

public interface CustomerService {

    public CustomerResponse createCustomer(CustomerRequest request);

    public CustomerResponse getCustomerById(long customerId);
}
