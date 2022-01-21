package com.casestudy.service;

import com.casestudy.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface IEmployeeService {
    List<Employee> findAll();

    Optional<Employee> findById(int id);

    void save(Employee  employee);

    void remove(int id);
}
