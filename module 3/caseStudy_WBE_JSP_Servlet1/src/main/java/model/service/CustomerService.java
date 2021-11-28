package model.service;

import model.bean.Customer;

import java.sql.SQLException;
import java.util.List;

public interface CustomerService {
    boolean insertCustomer(Customer customer)throws SQLException;

    Customer selectCustomer(int id);

    List<Customer> searchCustomer(String name);

    boolean deleteCustomer(int id);

    boolean updateCustomer(Customer customer);

    List<Customer> selectAll();
}
