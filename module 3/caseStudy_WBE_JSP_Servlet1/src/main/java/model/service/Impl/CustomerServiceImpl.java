package model.service.Impl;

import model.bean.Customer;
import model.repository.CustomerRepository;
import model.repository.Impl.CustomerRepositoryImpl;
import model.service.CustomerService;

import java.sql.SQLException;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    CustomerRepository customerRepository = new CustomerRepositoryImpl();
    @Override
    public boolean insertCustomer(Customer customer)throws SQLException {
        return customerRepository.insertCustomer(customer);
    }

    @Override
    public Customer selectCustomer(int id) {
        return customerRepository.selectCustomer(id);
    }

    @Override
    public List<Customer> searchCustomer(String name) {
        return customerRepository.searchCustomer(name);
    }

    @Override
    public boolean deleteCustomer(int id) {
        return customerRepository.deleteCustomer(id);
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        return customerRepository.updateCustomer(customer);
    }

    @Override
    public List<Customer> selectAll() {
        return customerRepository.selectAll();
    }
}
