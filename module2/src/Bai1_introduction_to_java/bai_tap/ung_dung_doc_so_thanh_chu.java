package Bai1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ung_dung_doc_so_thanh_chu {
    public static void main(String[] args) {
        int number, number1, number2, number3;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        number = sc.nextInt();

        number1 = number / 100;
        number2 = (number % 100) / 10;
        number3 = (number % 100) % 10;

        switch (number1) {
            case 0:
                System.out.print("");
                break;
            case 1:
                System.out.print("One hundred");
                break;
            case 2:
                System.out.print("Two hundred");
                break;
            case 3:
                System.out.print("Three hundred");
                break;
            case 4:
                System.out.print("Four hundred");
                break;
            case 5:
                System.out.print("Five hundred");
                break;
            case 6:
                System.out.print("Six hundred");
                break;
            case 7:
                System.out.print("Seven hundred");
                break;
            case 8:
                System.out.print("Eight hundred");
                break;
            case 9:
                System.out.print("Nine hundred");
                break;

        }

        if (number1 == 0) {
            switch (number2) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    if (number3 == 0) {
                        System.out.print("Ten");
                        break;
                    } else {
                        System.out.print("");
                        break;
                    }
                case 2:
                    System.out.print("Twenty");
                    break;
                case 3:
                    System.out.print("Thirty");
                    break;
                case 4:
                    System.out.print("Forty");
                    break;
                case 5:
                    System.out.print("Fifty");
                    break;
                case 6:
                    System.out.print("Sixty");
                    break;
                case 7:
                    System.out.print("Seventy");
                    break;
                case 8:
                    System.out.print("Eighty");
                    break;
                case 9:
                    System.out.print("Ninety");
                    break;

            }
        } else {
            switch (number2) {
                case 0:
                    if (number3 == 0) {
                        System.out.print("");
                        break;
                    }else {
                        System.out.print(" and");
                        break;
                    }
                case 1:
                    if (number3 == 0) {
                        System.out.print(" and ten");
                        break;
                    } else {
                        System.out.print("");
                        break;
                    }
                case 2:
                    System.out.print(" and twenty");
                    break;
                case 3:
                    System.out.print(" and thirty");
                    break;
                case 4:
                    System.out.print(" and forty");
                    break;
                case 5:
                    System.out.print(" and fifty");
                    break;
                case 6:
                    System.out.print(" and sixty");
                    break;
                case 7:
                    System.out.print(" and seventy");
                    break;
                case 8:
                    System.out.print(" and eighty");
                    break;
                case 9:
                    System.out.print(" and ninety");
                    break;

            }
        }


        if (number2 == 1) {
            if (number1 == 0) {
                switch (number3) {
                    case 1:
                        System.out.print("Eleven");
                        break;
                    case 2:
                        System.out.print("Twelve");
                        break;
                    case 3:
                        System.out.print("Thirteen");
                        break;
                    case 4:
                        System.out.print("Fourteen");
                        break;
                    case 5:
                        System.out.print("Fifteen");
                        break;
                    case 6:
                        System.out.print("Sixteen");
                        break;
                    case 7:
                        System.out.print("Seventeen");
                        break;
                    case 8:
                        System.out.print("Eighteen");
                        break;
                    case 9:
                        System.out.print("Nineteen");
                        break;
                }
            } else {
                switch (number3) {
                    case 1:
                        System.out.print(" and eleven");
                        break;
                    case 2:
                        System.out.print(" and twelve");
                        break;
                    case 3:
                        System.out.print(" and thirteen");
                        break;
                    case 4:
                        System.out.print(" and fourteen");
                        break;
                    case 5:
                        System.out.print(" and fifteen");
                        break;
                    case 6:
                        System.out.print(" and sixteen");
                        break;
                    case 7:
                        System.out.print(" and seventeen");
                        break;
                    case 8:
                        System.out.print(" and eighteen");
                        break;
                    case 9:
                        System.out.print(" and nineteen");
                        break;
                }
            }
        } else if (number1 == 0 && number2 == 0) {
            switch (number3) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("One");
                    break;
                case 2:
                    System.out.print("Two");
                    break;
                case 3:
                    System.out.print("Three");
                    break;
                case 4:
                    System.out.print("Four");
                    break;
                case 5:
                    System.out.print("Five");
                    break;
                case 6:
                    System.out.print("Six");
                    break;
                case 7:
                    System.out.print("Seven");
                    break;
                case 8:
                    System.out.print("Eight");
                    break;
                case 9:
                    System.out.print("Nine");
                    break;
            }
        } else {
            switch (number3) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print(" one");
                    break;
                case 2:
                    System.out.print(" two");
                    break;
                case 3:
                    System.out.print(" three");
                    break;
                case 4:
                    System.out.print(" four");
                    break;
                case 5:
                    System.out.print(" five");
                    break;
                case 6:
                    System.out.print(" six");
                    break;
                case 7:
                    System.out.print(" seven");
                    break;
                case 8:
                    System.out.print(" eight");
                    break;
                case 9:
                    System.out.print(" nine");
                    break;

            }
        }
    }
}