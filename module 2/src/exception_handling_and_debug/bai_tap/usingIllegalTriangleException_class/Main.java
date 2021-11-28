package exception_handling_and_debug.bai_tap.usingIllegalTriangleException_class;

public class Main {
    public static void main(String[] args) {
        Triangle triangle;
        try {
            triangle = new Triangle(90, 30, 100);
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
    }
}
