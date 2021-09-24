package caseStudy.controllers;

import caseStudy.services.impl.BookingServicesImpl;
import caseStudy.services.impl.CustomerServicesImpl;
import caseStudy.services.impl.EmployeeServicesImpl;
import caseStudy.services.impl.FacitilyServicesImpl;

import java.util.Scanner;

public class FuramaController {
    public void displayMainMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Managerment");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");

            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1:
                    displayEmployeeMenu();
                    break;
                case 2:
                    displayCustomerMenu();
                    break;
                case 3:
                    displayFacilityMenu();
                    break;
                case 4:
                    displayBookingMenu();
                    break;
                case 5:
                    displayPromotionMenu();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }
    }

    public void displayEmployeeMenu() {
        EmployeeServicesImpl employeeServices = new EmployeeServicesImpl();
        int choose = 0;
        boolean check = true;
        while (check) {
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");

            Scanner scanner = new Scanner(System.in);
            try {
                choose = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e) {
                e.printStackTrace();
            }
            switch (choose) {
                case 1:
                    employeeServices.display();
                    break;
                case 2:
                    employeeServices.add();
                    break;
                case 3:
                    employeeServices.edit();
                    break;
                case 4:
                    displayEmployeeMenu();
                    break;
            }
        }
    }

    public void displayCustomerMenu() {
        CustomerServicesImpl customerServices = new CustomerServicesImpl();
        int choose = 0;
        boolean check = true;
        while (check) {
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");

            Scanner scanner = new Scanner(System.in);
            try {
                choose = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e) {
                e.printStackTrace();
            }
            switch (choose) {
                case 1:
                    customerServices.display();
                    break;
                case 2:
                    customerServices.add();
                    break;
                case 3:
                    customerServices.edit();
                    break;
                case 4:
                    displayEmployeeMenu();
                    break;
            }
        }
    }

    public void displayFacilityMenu() {
        FacitilyServicesImpl facitilyServices = new FacitilyServicesImpl();
        int choose = 0;
        boolean check = true;
        while (check) {
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");

            Scanner scanner = new Scanner(System.in);
            try {
                choose = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e) {
                e.printStackTrace();
            }
            switch (choose) {
                case 1:
                    facitilyServices.display();
                    break;
                case 2:
                    displayNewFacilityMenu();
                    break;
                case 3:
                    break;
                case 4:
                    displayMainMenu();
                    break;
            }
        }
    }

    public void displayNewFacilityMenu() {
        FacitilyServicesImpl facitilyServices = new FacitilyServicesImpl();
        int choose = 0;
        boolean check = true;
        while (check) {
            System.out.println("1. Add new villa");
            System.out.println("2. Add new house");
            System.out.println("3. Add new room");
            System.out.println("4. Return main menu");

            Scanner scanner = new Scanner(System.in);
            try {
                choose = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e) {
                e.printStackTrace();
            }
            switch (choose) {
                case 1:
                    facitilyServices.addVilla();
                    displayFacilityMenu();
                    break;
                case 2:
                    facitilyServices.addHouse();
                    displayFacilityMenu();
                    break;
                case 3:
                    facitilyServices.addRoom();
                    displayFacilityMenu();
                    break;
                case 4:
                    displayFacilityMenu();
                    break;
            }
        }
    }

    public void displayBookingMenu() {
        BookingServicesImpl bookingServices = new BookingServicesImpl();
        int choose = 0;
        boolean check = true;
        while (check) {
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new constracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");

            Scanner scanner = new Scanner(System.in);
            try {
                choose = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e) {
                e.printStackTrace();
            }
            switch (choose) {
                case 1:
                    bookingServices.addBooking();
                    break;
                case 2:
                    bookingServices.display();
                    break;
            }
        }
    }

    public void displayPromotionMenu() {
        int choose = 0;
        boolean check = true;
        while (check) {
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Return main menu");

            Scanner scanner = new Scanner(System.in);
            try {
                choose = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e) {
                e.printStackTrace();
            }
            switch (choose) {

            }
        }
    }

    public static void main(String[] args) {
        FuramaController furamaController = new FuramaController();
        furamaController.displayMainMenu();
    }
}
