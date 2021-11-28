package model.repository;

import model.bean.Employee;

import java.util.List;

public interface EmployeeRepository {

    boolean insertEmployee(Employee employee);

    Employee selectEmployee(int id);

    Employee searchEmployee(String name);

    boolean deleteEmployee(int id);

    boolean updateEmployee(Employee employee);

    List<Employee> selectAll();
}
