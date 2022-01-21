package com.casestudy.service;

import com.casestudy.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface ICustomerService {
    List<Customer> findAll();

    Optional<Customer> findById(String id);

    void save(Customer customer);

    void remove(String id);

    Page<Customer> findAll(Pageable pageable);

    Page<Customer> findAllByName(Pageable pageable, String name);
}
