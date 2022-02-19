package com.casestudy.repository;

import com.casestudy.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, String> {
//    @Query("select c.customer_name from Customer c where c.customer_name like %:name%")
//    Page<Customer> findAllByCustomer_nameContaining(Pageable pageable, String name);

    Page<Customer> findAllByCustomerNameContaining(Pageable pageable, String name);

}
