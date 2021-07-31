package accessModifier_staticMethod_staticProperty.bai_tap.accessModifier;

public class Circle {
    private double radius = 1.0;
    private String color = "Red";

    public Circle() {
    }

    public Circle(double r) {
        this.radius = r;
    }


    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return 3.14 * Math.pow(this.radius,2);
    }
}
