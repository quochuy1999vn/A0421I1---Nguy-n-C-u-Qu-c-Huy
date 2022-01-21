package com.casestudy.repository;

import com.casestudy.entity.Customer_type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerTypeRepository extends JpaRepository<Customer_type, Integer> {
}
