package inheritance.bai_tap.classCircle_and_classCylinder;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();

        circle.setColor("Red");
        circle.setRadius(2);
        System.out.println("Area: " + circle.getArea());
        System.out.println(circle.toString());
    }
}
