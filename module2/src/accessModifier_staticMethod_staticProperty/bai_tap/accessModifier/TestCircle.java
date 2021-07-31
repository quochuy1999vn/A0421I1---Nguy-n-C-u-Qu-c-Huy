package accessModifier_staticMethod_staticProperty.bai_tap.accessModifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());

        Circle circle1 = new Circle(2);
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Area: " + circle1.getArea());
    }
}
