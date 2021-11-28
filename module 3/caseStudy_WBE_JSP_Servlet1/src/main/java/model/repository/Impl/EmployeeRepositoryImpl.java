package model.repository.Impl;

import model.bean.Employee;
import model.repository.EmployeeRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    String URL = "jdbc:mysql://localhost:3306/casestudy_jsp_and_servlet?useSSL=false";
    String USER = "root";
    String PASSWORD = "123456";

    private static final String INSERT_EMPLOYEE = "INSERT INTO employee" + "  (employee_name, employee_birthday,"
            + " employee_id_card, employee_salary, employee_phone, employee_email, employee_address) VALUES "
            + " (?, ?, ?, ?, ?, ?, ?);";
    private static final String SELECT_EMPLOYEE_BY_ID = "select employee_id,employee_name,employee_birthday,employee_id_card," +
            "employee_salary, employee_phone, employee_email, employee_address from employee where employee_id =?";
    private static final String SELECT_EMPLOYEE_BY_NAME = "select employee_id,employee_name,employee_birthday,employee_id_card, " +
            "employee_salary, employee_phone, employee_email, employee_address from employee where employee_name like ?";
    private static final String SELECT_ALL_EMPLOYEE = "select * from employee";
    private static final String DELETE_EMPLOYEE_SQL = "delete from employee where employee_id = ?;";
    private static final String UPDATE_EMPLOYEE_SQL = "update employee set employee_name = ?, employee_birthday= ?, employee_id_card = ? " +
            ", employee_salary = ?, employee_phone = ?, employee_email = ?, employee_address = ?, where employee_id = ?;";

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
    public boolean insertEmployee(Employee employee) {
        Connection connection = null;
        connection = getConnection();
        boolean check = false;

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_EMPLOYEE);
            preparedStatement.setString(1, employee.getEmployee_name());
            preparedStatement.setString(2, employee.getEmployee_birthday());
            preparedStatement.setString(3, employee.getEmployee_id_card());
            preparedStatement.setDouble(4, employee.getEmployee_salary());
            preparedStatement.setString(5, employee.getEmployee_phone());
            preparedStatement.setString(6, employee.getEmployee_email());
            preparedStatement.setString(7, employee.getEmployee_address());
            check = preparedStatement.executeUpdate()>0;
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check;
    }

    @Override
    public Employee selectEmployee(int id) {
        Employee employee = null;

        try(Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_EMPLOYEE_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String birthday = resultSet.getString("birthday");
                String idCard = resultSet.getString("id card");
                double salary = resultSet.getDouble("salary");
                String numberPhone = resultSet.getString("number phone");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                employee = new Employee(id, name, birthday, idCard, salary, numberPhone, email, address);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }

    @Override
    public Employee searchEmployee(String name) {
        Employee employee = null;

        try(Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_EMPLOYEE_BY_NAME);
            preparedStatement.setString(1, "%" + name + "%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String birthday = resultSet.getString("birthday");
                String idCard = resultSet.getString("id card");
                double salary = resultSet.getDouble("salary");
                String numberPhone = resultSet.getString("number phone");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                employee = new Employee(id, name, birthday, idCard, salary, numberPhone, email, address);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }

    @Override
    public boolean deleteEmployee(int id) {
        Connection connection = null;
        connection = getConnection();
        boolean check = false;

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_EMPLOYEE_SQL);
            preparedStatement.setString(1, String.valueOf(id));
            check = preparedStatement.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check;
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        Connection connection = null;
        connection = getConnection();
        boolean check = false;

        try {
            CallableStatement callableStatement = connection.prepareCall(UPDATE_EMPLOYEE_SQL);
            callableStatement.setString(1, employee.getEmployee_name());
            callableStatement.setString(2, employee.getEmployee_birthday());
            callableStatement.setString(3, employee.getEmployee_id_card());
            callableStatement.setDouble(4, employee.getEmployee_salary());
            callableStatement.setString(5, employee.getEmployee_phone());
            callableStatement.setString(6, employee.getEmployee_email());
            callableStatement.setString(7, employee.getEmployee_address());
            check = callableStatement.executeUpdate()>0;
            callableStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check;
    }

    @Override
    public List<Employee> selectAll() {
        List<Employee> employeeList = new ArrayList<>();
        Connection connection = null;
        connection = getConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_EMPLOYEE);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String birthday = resultSet.getString("birthday");
                String idCard = resultSet.getString("id card");
                double salary = resultSet.getDouble("salary");
                String numberPhone = resultSet.getString("number phone");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                employeeList.add(new Employee(id, name, birthday, idCard, salary, numberPhone, email, address));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employeeList;
    }
}
