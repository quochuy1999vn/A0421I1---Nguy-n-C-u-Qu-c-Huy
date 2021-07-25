package class_and_object_in_java.class_rectangle;

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.print("Your Rectangle \n" + rectangle.display());
        System.out.print("\nPerimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.print("\nArea of the Rectangle: " + rectangle.getArea());
    }
}
