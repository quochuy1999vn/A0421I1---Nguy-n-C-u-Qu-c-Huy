package model.service;

import model.bean.Customer;

import java.util.List;

public interface CustomerService {
    boolean insertCustomer(Customer customer);

    Customer selectCustomer(int id);

    Customer searchCustomer(String name);

    boolean deleteCustomer(int id);

    boolean updateCustomer(Customer customer);

    List<Customer> selectAll();
}
