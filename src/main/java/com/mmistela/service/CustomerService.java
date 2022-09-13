package com.mmistela.service;

import com.mmistela.entity.Customer;

import java.util.Optional;

public interface CustomerService {
    Optional<Customer> findByFullName(String firstname);
}
