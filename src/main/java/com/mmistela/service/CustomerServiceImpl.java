package com.mmistela.service;

import com.mmistela.entity.Customer;
import com.mmistela.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public Optional<Customer> findByFullName(String firstname) {
        return Optional.of(customerRepository.findByFullName(firstname).orElseThrow(NoSuchElementException::new));
    }
}
