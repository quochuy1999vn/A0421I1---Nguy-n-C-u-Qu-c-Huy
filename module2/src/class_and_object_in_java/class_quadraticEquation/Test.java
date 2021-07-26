package class_and_object_in_java.class_quadraticEquation;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        QuadraticEquation test = new QuadraticEquation();
        double a, b, c;
        System.out.print("Enter a, b, c: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        test.setA(a);
        test.setB(b);
        test.setC(c);

        if (test.getDiscriminant() > 0) {
            System.out.print("The equation has two roots " + test.getRoot1() + " and " + test.getRoot2());
        }else if (test.getDiscriminant() == 0) {
            System.out.print("The equation has one root " + test.getRoot1());
        }else {
            System.out.print("The equation has no real roots");
        }

    }
}
