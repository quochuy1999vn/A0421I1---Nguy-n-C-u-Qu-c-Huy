package model.repository;

import model.bean.Customer;

import java.util.List;

public interface CustomerRepository {
    boolean insertCustomer(Customer customer);

    Customer selectCustomer(int id);

    List<Customer> searchCustomer(String name);

    boolean deleteCustomer(int id);

    boolean updateCustomer(Customer customer);

    List<Customer> selectAll();
}
