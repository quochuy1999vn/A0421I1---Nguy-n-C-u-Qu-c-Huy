package model.repository.Impl;

import model.bean.Customer;
import model.repository.CustomerRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {
    String URL = "jdbc:mysql://localhost:3306/casestudy_jsp_and_servlet?useSSL=false";
    String USER = "root";
    String PASSWORD = "123456";

    private static final String INSERT_CUSTOMER = "INSERT INTO customer" + "  (customer_name, customer_type_id, customer_birthday,"
            + " customer_gender, customer_id_card, employee_phone, customer_email, customer_address) VALUES "
            + " (?, ?, ?, ?, ?, ?, ?, ?);";
    private static final String SELECT_CUSTOMER_BY_ID = "select customer_id, customer_name,customer_birthday,customer_gender,customer_id_card," +
            "customer_phone, customer_email, customer_address, customer_type_id from customer where customer_id =?";
    private static final String SELECT_CUSTOMER_BY_NAME = "select customer_id, customer_type_id, customer_name, customer_birthday, customer_gender" +
            ",customer_id_card, customer_phone, customer_email, customer_address from customer where customer_name like ?";
    private static final String SELECT_ALL_CUSTOMER = "select * from customer";
    private static final String DELETE_CUSTOMER_SQL = "delete from customer where customer_id = ?;";
    private static final String UPDATE_CUSTOMER_SQL = "update customer set customer_type_id = ?, customer_name = ?, customer_birthday= ?, customer_gender = ?, " +
            "customer_id_card = ?, customer_phone = ?, customer_email = ?, customer_address = ?, where customer_id = ?;";

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
    @Override
    public boolean insertCustomer(Customer customer) {
        try(Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CUSTOMER);
            preparedStatement.setString(1, customer.getCustomer_name());
            preparedStatement.setInt(2, customer.getCustomer_type_id());
            preparedStatement.setString(3, customer.getCustomer_birthday());
            preparedStatement.setBoolean(4, customer.isCustomer_gender());
            preparedStatement.setString(5, customer.getCustomer_id_card());
            preparedStatement.setString(6, customer.getCustomer_phone());
            preparedStatement.setString(7, customer.getCustomer_email());
            preparedStatement.setString(8, customer.getCustomer_address());

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Customer selectCustomer(int id) {
        Customer customer = null;

        try(Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMER_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("customer_id");
                int idType = resultSet.getInt("customer_id_type");
                String birthday = resultSet.getString("customer_birthday");
                Boolean gender = resultSet.getBoolean("customer_gender");
                String idCard = resultSet.getString("customer_id_card");
                String numberPhone = resultSet.getString("customer_phone");
                String email = resultSet.getString("email");
                String address = resultSet.getString("customer_address");
                customer = new Customer(id, idType, name, birthday, gender, idCard, numberPhone, email, address);
            }
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customer;
    }

    @Override
    public List<Customer> searchCustomer(String name) {
        List<Customer> customerList = null;

        try(Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMER_BY_NAME);
            preparedStatement.setString(1, "%" + name + "%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("customer_id");
                int idType = resultSet.getInt("customer_id_type");
                String birthday = resultSet.getString("customer_birthday");
                Boolean gender = resultSet.getBoolean("customer_gender");
                String idCard = resultSet.getString("customer_id_card");
                String numberPhone = resultSet.getString("customer_phone");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                customerList.add(new Customer(id, idType, name, birthday, gender, idCard, numberPhone, email, address));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    @Override
    public boolean deleteCustomer(int id) {
        boolean rowDelete = false;
        try(Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_CUSTOMER_SQL);
            preparedStatement.setInt(1, id);
            rowDelete = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDelete;
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        boolean rowUpdate = false;
        try(Connection connection = getConnection()) {
            CallableStatement callableStatement = connection.prepareCall(UPDATE_CUSTOMER_SQL);
            callableStatement.setString(1, customer.getCustomer_name());
            callableStatement.setInt(2, customer.getCustomer_type_id());
            callableStatement.setString(3, customer.getCustomer_birthday());
            callableStatement.setBoolean(4, customer.isCustomer_gender());
            callableStatement.setString(5, customer.getCustomer_id_card());
            callableStatement.setString(6, customer.getCustomer_phone());
            callableStatement.setString(7, customer.getCustomer_email());
            callableStatement.setString(8, customer.getCustomer_address());
            rowUpdate = callableStatement.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowUpdate;
    }

    @Override
    public List<Customer> selectAll() {
        List<Customer> customerList = new ArrayList<>();

        try(Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("customer_id");
                int typeId = resultSet.getInt("customer_type_id");
                String name = resultSet.getString("customer_name");
                String birthday = resultSet.getString("customer_birthday");
                Boolean gender = resultSet.getBoolean("customer_gender");
                String idCard = resultSet.getString("customer_id_card");
                String numberPhone = resultSet.getString("customer_phone");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                customerList.add(new Customer(id, typeId, name, birthday,gender, idCard, numberPhone, email, address));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }
}
