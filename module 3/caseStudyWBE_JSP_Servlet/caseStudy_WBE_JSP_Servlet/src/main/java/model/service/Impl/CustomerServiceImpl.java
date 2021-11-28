package model.service.Impl;

import model.bean.Customer;
import model.service.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    CustomerRepository customerService = new CustomerRepositoryImpl();
    @Override
    public boolean insertCustomer(Customer customer) {
        return customerService.insertCustomer(customer);
    }

    @Override
    public Customer selectCustomer(int id) {
        return customerService.selectCustomer(id);
    }

    @Override
    public Customer searchCustomer(String name) {
        return customerService.searchCustomer(name);
    }

    @Override
    public boolean deleteCustomer(int id) {
        return customerService.deleteCustomer(id);
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        return customerService.updateCustomer(customer);
    }

    @Override
    public List<Customer> selectAll() {
        return customerService.selectAll();
    }
}
