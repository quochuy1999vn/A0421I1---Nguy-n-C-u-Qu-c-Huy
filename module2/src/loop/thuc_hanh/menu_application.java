package loop.thuc_hanh;

import java.util.Scanner;

public class menu_application {
    public static void main(String[] args) {
        int choose;
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------MENU----------");
        System.out.println("------------------------");
        System.out.println("-- 1. Draw the triangle.");
        System.out.println("-- 2. Draw the square.");
        System.out.println("-- 3. Draw the rectangle.");
        System.out.println("-- 0. Exit.");
        System.out.println("------------------------");
        System.out.println("Enter your choose: ");
        choose = scanner.nextInt();

        switch (choose) {
            case 1:
                System.out.println("Draw the triangle");
                System.out.println("******");
                System.out.println("*****");
                System.out.println("****");
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
                break;
            case 2:
                System.out.println("Draw the square");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 3:
                System.out.println("Draw the rectangle");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choose!");

        }
    }
}
