package Bai1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class doi_tien {
    public static void main(String[] args) {
        int usd, vnd, choose;
        System.out.println("-- CHANGE MONEY --");
        System.out.println("------------------");
        System.out.println("--1. USD to VND --");
        System.out.println("--2. VND to USD --");
        System.out.println("------------------");
        System.out.print("--- Choose: ");
        Scanner sc = new Scanner(System.in);
        choose = sc.nextInt();

        switch (choose) {
            case 1:
                System.out.print("Enter USD: ");
                usd = sc.nextInt();

                vnd = usd * 23000;

                System.out.print(usd + " USD = " + vnd + " VND");
                break;
            case 2:
                System.out.print("Enter VND: ");
                vnd = sc.nextInt();

                usd = vnd / 23000;

                System.out.print(vnd + " VND = " + usd + " USD");
                break;
        }
    }
}
