package caseStudy.services.impl;

import caseStudy.models.Facility;
import caseStudy.models.House;
import caseStudy.models.Room;
import caseStudy.models.Villa;
import caseStudy.services.FacilityServices;
import caseStudy.utils.ReadAndWrite;
import caseStudy.utils.RegexData;

import java.util.*;

public class FacitilyServicesImpl implements FacilityServices {

    private static final String REGEX_STR = "[A-Z][a-z]+";
    private static final String REGEX_ID_VILLA = "(SVVL)[-][\\d]{4}";
    private static final String REGEX_ID_HOUSE = "(SVHO)[-][\\d]{4}";
    private static final String REGEX_ID_ROOM = "(SVRO)[-][\\d]{4}";
    private static final String REGEX_AMOUNT = "^[1-9]|([1][0-9])|(20)$";
    private static final String REGEX_INT = "^[1-9]|([1][0-9])$";
    private static final String REGEX_AREA = "^([3-9]\\d|[1-9]\\d{2,})$";
    private static final String REGEX_TIME = "^[1-9]|([1][0-9])|([2][0-4])$";
        private static final String REGEX_DAY = "^[1-9]|([1][0-9])$";
    private static final String REGEX_MONTH = "^[1-9]|([1][1-2])$";
    private static final String REGEX_VILLA = "[A-Z][a-z]+";
    private static final String REGEX_HOUSE = "[A-Z][a-z]+";
    private static final String REGEX_ROOM = "[A-Z][a-z]+";
    private static final String REGEX_FLOOR = "^[1-9]$";
    private static final String REGEX_FOOL = "^([3-9]\\d[1-9]\\d{2,})$";
    private static final String REGEX_STYLE = "[A-Z][a-z]+";
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        ReadAndWrite.read("F:\\A0421I1 - Nguyen Cuu Quoc Huy\\module2\\src\\caseStudy\\data\\villa.csv");
        ReadAndWrite.read("F:\\A0421I1 - Nguyen Cuu Quoc Huy\\module2\\src\\caseStudy\\data\\house.csv");
        ReadAndWrite.read("F:\\A0421I1 - Nguyen Cuu Quoc Huy\\module2\\src\\caseStudy\\data\\room.csv");
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            System.out.println("Services: "+element.getKey() + " Số người đã thuê: " + element.getValue());
        }
    }

    @Override
    public void displayMaintain() {

    }

    @Override
    public void addVilla() {

        String id = inputIdVilla();

        String name = inputName();

        double areaUse = Double.parseDouble(inputArea());

        int price = Integer.parseInt(inputPrice());

        int people = Integer.parseInt(inputAmount());

        int style =  Integer.parseInt(inputStyle());

        String villa = inputVilla();

        int areaPool = Integer.parseInt(inputAreaFool());

        int floor = Integer.parseInt(inputFloor());
        Villa villa1 = new Villa(id, name, areaUse, price, people, style, villa, areaPool, floor);
        facilityIntegerMap.put(villa1, 0);
        ReadAndWrite.write((Collection) facilityIntegerMap, "F:\\A0421I1 - Nguyen Cuu Quoc Huy\\module2\\src\\caseStudy\\data\\villa.csv");
        System.out.println("Đã thêm mới villa thành công");
    }
    private String inputIdVilla() {
        System.out.println("Nhập id: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_ID_VILLA, "Bạn đã nhập sai định dạng");
    }
    private String inputName() {
        System.out.println("Nhập tên: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_STR, "Bạn đã nhập sai định dạng");
    }
    private String inputArea() {
        System.out.println("Nhập diện tích: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_AREA, "Bạn đã nhập sai định dạng");
    }
    private String inputPrice() {
        System.out.println("Nhập giá tiền: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_INT, "Bạn đã nhập sai định dạng");
    }
    private String inputAmount() {
        System.out.println("Nhập số lượng người: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_AMOUNT, "Bạn đã nhập sai định dạng");
    }
    private String inputDay() {
        System.out.println("Nhập số ngày: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_DAY, "Bạn đã nhập sai định dạng");
    }
    private String inputTime() {
        System.out.println("Nhập số giờ: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_TIME, "Bạn đã nhập sai định dạng");
    }
    private String inputMonth() {
        System.out.println("Nhập số tháng: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_MONTH, "Bạn đã nhập sai định dạng");
    }
    private String inputVilla() {
        System.out.println("Nhập kiểu villa: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_VILLA, "Bạn đã nhập sai định dạng");
    }
    private String inputHouse() {
        System.out.println("Nhập kiểu house: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_VILLA, "Bạn đã nhập sai định dạng");
    }
    private String inputRoom() {
        System.out.println("Nhập kiểu room: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_VILLA, "Bạn đã nhập sai định dạng");
    }
    private String inputFloor() {
        System.out.println("Nhập số tầng: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_FLOOR, "Bạn đã nhập sai định dạng");
    }
    private String inputAreaFool() {
        System.out.println("Nhập số tầng: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_FOOL, "Bạn đã nhập sai định dạng");
    }
    private String inputStyle() {
        System.out.println("Nhập kiểu mong muốn: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_STYLE, "Bạn đã nhập sai định dạng");
    }
    private String inputIdHouse() {
        System.out.println("Nhập id: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_ID_HOUSE, "Bạn đã nhập sai định dạng");
    }
    private String inputIdRoom() {
        System.out.println("Nhập id: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_ID_ROOM, "Bạn đã nhập sai định dạng");
    }

//    private String rentalType() {
//        int choice = 0;
//        boolean check = true;
//        while (check){
//            System.out.println("1. By time");
//            System.out.println("2. By day");
//            System.out.println("3. By month");
//
//            try {
//                choice = Integer.parseInt(scanner.nextLine());
//            }catch (Exception e) {
//                e.printStackTrace();
//            }
//            switch (choice) {
//                case 1:
//                    inputTime();
//                    break;
//                case 2:
//                    String day = inputDay();
//                    break;
//                case 3:
//                    String month = inputMonth();
//                    break;
//
//            }
//        }
//        check = false;
//        return null;
//    }

    @Override
    public void addHouse() {

        String id = inputIdHouse();

        String name = inputName();

        double areaUse = Double.parseDouble(inputArea());

        int price = Integer.parseInt(inputPrice());

        int people = Integer.parseInt(inputAmount());

        String style = inputStyle();

        String house = inputHouse();

        int floor = Integer.parseInt(inputFloor());
        House houses = new House(id, name, areaUse, price, people, style, house, floor);
        facilityIntegerMap.put(houses, 0);
        ReadAndWrite.write((Collection) facilityIntegerMap, "F:\\A0421I1 - Nguyen Cuu Quoc Huy\\module2\\src\\caseStudy\\data\\house.csv");
    }

    @Override
    public void addRoom() {

        String id = inputIdRoom();

        String name = inputName();

        double areaUse = Double.parseDouble(inputArea());

        int price = Integer.parseInt(inputPrice());

        int people = Integer.parseInt(inputAmount());

        String style = inputStyle();
        System.out.println("Nhập khuyến mãi đi kèm: ");
        String free = scanner.nextLine();
        Room rooms = new Room(id, name, areaUse, price, people, style, free);
        facilityIntegerMap.put(rooms, 0);
        ReadAndWrite.write((Collection) facilityIntegerMap, "F:\\A0421I1 - Nguyen Cuu Quoc Huy\\module2\\src\\caseStudy\\data\\room.csv");
    }
}
