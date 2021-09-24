package caseStudy.services.impl;

import caseStudy.models.Booking;
import caseStudy.models.Customer;
import caseStudy.models.Facility;
import caseStudy.models.Villa;
import caseStudy.services.BookingServices;
import caseStudy.utils.ReadAndWrite;

import java.util.*;

public class BookingServicesImpl implements BookingServices {
    private static Set<Booking> bookings = new TreeSet<>();

    private static List<Customer> customerList = new ArrayList<>();

    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        customerList.add(new Customer(1, "huy", 21, "nam", "123", "huy@gmail.com", "VIP", "Huế"));
        customerList.add(new Customer(2, "nhi", 20, "nữ", "1234", "nhi@gmail.com", "NORMAL", "Huế"));

        facilityIntegerMap.put(new Villa("1", "villa", 15, 20, 2, "theo tuần", "biệt thự", 15, 6), 0);
        facilityIntegerMap.put(new Villa("1", "villa2", 15, 20, 2, "theo tuần", "bình thường", 15, 6), 0);
    }

    @Override
    public void addBooking() {

        int id = 1;
        if (bookings.isEmpty()) {
            id = bookings.size();
        }

        Customer customer = chooseCustomer();
        Facility facility = chooseFacitily();
        System.out.println("Nhập ngày bắt đầu thuê: ");
        String startDate = scanner.nextLine();
        System.out.println("Nhập ngày trả phòng: ");
        String endDate = scanner.nextLine();
        Booking booking = new Booking(id, startDate, endDate, customer, facility);
        bookings.add(booking);
        ReadAndWrite.write(bookings, "F:\\A0421I1 - Nguyen Cuu Quoc Huy\\module2\\src\\caseStudy\\data\\booking.csv");
        System.out.println("Đã booking thành công!!!");

    }

    @Override
    public void display() {
        ReadAndWrite.read("F:\\A0421I1 - Nguyen Cuu Quoc Huy\\module2\\src\\caseStudy\\data\\booking.csv");
        for (Booking booking : bookings) {
            System.out.println(booking.toString());
        }
    }

    public static Customer chooseCustomer() {
        System.out.println("Danh sách khách hàng: ");
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
        System.out.println("Nhập id khách hàng: ");
        boolean check = true;
        int id = 0;
        try {
            id = Integer.parseInt(scanner.nextLine());
        }catch (Exception e) {
            e.printStackTrace();
        }

        while (check) {
            for (Customer customer : customerList) {
                if (id == customer.getId()) {
                    check = false;
                    return customer;
                }
            }
            if (check) {
                System.out.println("Bạn đã nhập sai, vui lòng nhập id khách hàng: ");
                id = Integer.parseInt(scanner.nextLine());
            }
        }
        return null;
    }

    public static Facility chooseFacitily() {
        System.out.println("Danh sách dịch vụ: ");
        for (Map.Entry<Facility, Integer> facilityIntegerEntry : facilityIntegerMap.entrySet()) {
            System.out.println(facilityIntegerEntry.getKey().toString());
        }
        System.out.println("Nhập id dịch vụ: ");
        boolean check = true;
        String id = "";
        try {
            id = scanner.nextLine();
        }catch (Exception e) {
            e.printStackTrace();
        }

        while (check) {
            for (Map.Entry<Facility, Integer> facilityIntegerEntry : facilityIntegerMap.entrySet()) {
                if (id.equals(facilityIntegerEntry.getKey().getIdFacilily())) {
                    check = false;
                    return facilityIntegerEntry.getKey();
                }
            }
            if (check) {
                System.out.println("Bạn đã nhập sai, vui lòng nhập id khách hàng: ");
                id = scanner.nextLine();
            }
        }
        return null;
    }


}
