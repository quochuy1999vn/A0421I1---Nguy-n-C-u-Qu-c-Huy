package bai1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Which month that you want to count day?: ");
        int month = sc.nextInt();

        System.out.println("Enter year: ");
        int year = sc.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("The month " + month + " has 31 day");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("The month " + month + " has 30 day");
                break;
            case 2:
                if ((year % 4== 0 &&year%100 != 0 && year % 400 != 0)||(year%100 == 0 && year % 400 == 0)) {
                    System.out.println("The month " + month + " has 29 day");
                }else {
                    System.out.println("The month " + month + " has 28 day");
                }

        }
    }
}
