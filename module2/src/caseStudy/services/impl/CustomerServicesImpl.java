package caseStudy.services.impl;

import caseStudy.models.Customer;
import caseStudy.services.CustomerServices;
import caseStudy.utils.ReadAndWrite;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServicesImpl implements CustomerServices {
    private static List<Customer> customerList = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        customerList.add(new Customer(1, "huy", 21, "nam", "123", "huy@gmail.com", "vip", "huế"));
    }

    @Override
    public void display() {
        customerList = (List<Customer>) ReadAndWrite.read("F:\\A0421I1 - Nguyen Cuu Quoc Huy\\module2\\src\\caseStudy\\data\\employee.csv");
        for (Customer customer : customerList) {
            System.out.println(customerList.toString());
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
        System.out.println("Nhập typeCustomer: ");
        String typeCustomer = scanner.nextLine();
        System.out.println("Nhập address: ");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, name, age, sex, idCard, email, typeCustomer, address);
        customerList.add(customer);
        ReadAndWrite.write(customerList, "F:\\A0421I1 - Nguyen Cuu Quoc Huy\\module2\\src\\caseStudy\\data\\employee.csv");
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
        boolean customer1 = getId(index);
        for (int i = 0; i < customerList.size(); i++) {
            if (customer1) {
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
                System.out.println("Nhập typeCustomer: ");
                String typeCustomer = scanner.nextLine();
                System.out.println("Nhập address: ");
                String address = scanner.nextLine();
                Customer customer = new Customer(id, name, age, sex, idCard, email, typeCustomer, address);
                customerList.set(i, customer);
        }else {
                System.out.println("Id không tồn tại");
            }
        }
    }

    public boolean getId(int index) {
        for (Customer customer : customerList) {
            if (customer.getId() == index) {
                return true;
            }
        }
        return false;
    }
}
