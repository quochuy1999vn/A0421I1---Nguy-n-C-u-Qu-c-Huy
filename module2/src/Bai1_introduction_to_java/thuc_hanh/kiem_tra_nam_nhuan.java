package Bai1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class kiem_tra_nam_nhuan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter year want check: ");
        int year = sc.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("%d is a leap year: " + year);
                }else {
                    System.out.println("%d is NOT a leap year: " + year);
                }
            }else {
                System.out.println("%d is a leap year: " + year);
            }
        }else {
            System.out.println("%d is NOT a leap year: " + year);
        }
    }
}
