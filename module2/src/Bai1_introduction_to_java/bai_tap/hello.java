package Bai1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Hello: " + name);
    }
}
