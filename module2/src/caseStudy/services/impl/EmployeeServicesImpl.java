package caseStudy.services.impl;

import caseStudy.models.Employee;
import caseStudy.services.EmployeeServices;
import caseStudy.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServicesImpl implements EmployeeServices {

    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        employeeList = (List<Employee>) ReadAndWrite.read("F:\\A0421I1 - Nguyen Cuu Quoc Huy\\module2\\src\\caseStudy\\data\\employee.csv");
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập name: ");
        String name = scanner.nextLine();
        System.out.println("Nhập age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập sex: ");
        String sex = scanner.nextLine();
        System.out.println("Nhập idCard: ");
        String idCard = scanner.nextLine();
        System.out.println("Nhập email: ");
        String email = scanner.nextLine();
        System.out.println("Nhập chức vụ: ");
        String level = scanner.nextLine();
        System.out.println("Nhập vị trí: ");
        String positon = scanner.nextLine();
        System.out.println("Nhập lương: ");
        int salary = Integer.parseInt(scanner.nextLine());
        Employee employee = new Employee(id, name, age, sex, idCard, email, level, positon, salary);
        employeeList.add(employee);
        ReadAndWrite.write(employeeList, "F:\\A0421I1 - Nguyen Cuu Quoc Huy\\module2\\src\\caseStudy\\data\\employee.csv");
    }

    @Override
    public void edit() {
        System.out.println("Nhập id cần chỉnh sửa: ");
        int index = 0;
        try {
            index = Integer.parseInt(scanner.nextLine());
        }catch (Exception e) {
            e.printStackTrace();
        }
        boolean employee1 = getId(index);
        for (int i = 0; i < employeeList.size(); i++) {
            if (employee1) {
                System.out.println("Nhập id: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập name: ");
                String name = scanner.nextLine();
                System.out.println("Nhập age: ");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập sex: ");
                String sex = scanner.nextLine();
                System.out.println("Nhập idCard: ");
                String idCard = scanner.nextLine();
                System.out.println("Nhập email: ");
                String email = scanner.nextLine();
                System.out.println("Nhập chức vụ: ");
                String level = scanner.nextLine();
                System.out.println("Nhập bộ phận: ");
                String position = scanner.nextLine();
                System.out.println("Nhập lương: ");
                int salary = Integer.parseInt(scanner.nextLine());
                Employee employee = new Employee(id, name, age, sex, idCard, email, level, position, salary);
                employeeList.set(i, employee);
            }else {
                System.out.println("Id không tồn tại");
            }
        }
    }

    public boolean getId(int index) {
        for (Employee employee : employeeList) {
            if (employee.getId() == index) {
                return true;
            }
        }
        return false;
    }


}
