package Bai1_introduction_to_java.thuc_hanh;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class BMI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double weight, height, bmi;

        System.out.print("your weight: ");
        weight = sc.nextDouble();

        System.out.print("your height: ");
        height = sc.nextDouble();

        bmi = weight / Math.pow(height,2);

        System.out.printf("%-20s%s", "BMI", "Interpretation\n");

        if (bmi < 18) {
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        }else if (bmi < 25.0) {
            System.out.printf("%-20.2f%s", bmi, "normal");
        }else if(bmi < 30.0) {
            System.out.printf("%-20.2f%s", bmi, "Obese");
        }
    }
}
