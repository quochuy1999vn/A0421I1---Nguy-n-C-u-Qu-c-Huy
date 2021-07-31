package bai1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class PhuongTrinhBatNhat {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Give a equation as a 'a * x + b = 0', please enter constants:");

        Scanner sc = new Scanner(System.in);

        System.out.println("a: ");
        double a = sc.nextDouble();

        System.out.println("b: ");
        double b = sc.nextDouble();

        System.out.println("c: ");
        double c = sc.nextDouble();

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f! \n", answer);
        }else {
            if (b == 0) {
                System.out.println("The solution is all x!");;
            }else {
                System.out.println("No solution!");
            }
        }


    }
}
