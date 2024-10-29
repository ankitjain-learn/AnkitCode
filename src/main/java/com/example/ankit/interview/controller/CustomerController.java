package com.example.ankit.interview.controller;


import com.example.ankit.interview.dto.CustomerResponse;
import com.example.ankit.interview.entity.Customer;
import com.example.ankit.interview.dto.CustomerRequest;
import com.example.ankit.interview.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {

    @Autowired
    CustomerService customerService;


    @GetMapping("/customer/{customerId}")
    public ResponseEntity<CustomerResponse> getCustomerById(@PathVariable("customerId") long customerId) {
        CustomerResponse response = customerService.getCustomerById(customerId);
        return new ResponseEntity<>(response, HttpStatus.OK);

    }

    @PostMapping("/customer")
    public ResponseEntity<CustomerResponse> createCustomer(@RequestBody CustomerRequest request) {
        CustomerResponse response = customerService.createCustomer(request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);

    }


}
