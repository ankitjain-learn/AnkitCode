package com.example.ankit.interview.service.impl;

import com.example.ankit.interview.dto.CustomerResponse;
import com.example.ankit.interview.entity.Customer;
import com.example.ankit.interview.repository.CustomerRepository;
import com.example.ankit.interview.dto.CustomerRequest;
import com.example.ankit.interview.service.CustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public CustomerResponse createCustomer(CustomerRequest request) {
        Customer customer = new Customer();
        customer.setFirstName(request.getFirstName());
        customer.setLastName(request.getLastName());
        customer.setDob(request.getDob());
        Customer response = customerRepository.save(customer);
        CustomerResponse customerResponse = new CustomerResponse();
        BeanUtils.copyProperties(response,customerResponse);
        return customerResponse;
    }

    @Override
    public CustomerResponse getCustomerById(long customerId) {
        Customer response = customerRepository.findById(customerId);
        CustomerResponse customerResponse = new CustomerResponse();
        BeanUtils.copyProperties(response,customerResponse);
        return customerResponse;
    }
}
