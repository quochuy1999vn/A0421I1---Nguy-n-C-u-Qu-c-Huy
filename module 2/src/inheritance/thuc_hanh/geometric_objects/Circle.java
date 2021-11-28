package inheritance.thuc_hanh.geometric_objects;

public class Circle extends Shape{
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return 3.14 * Math.pow(radius,2);
    }

    public double getPerimeter() {
        return 2 * radius * 3.14;
    }

    public String toString() {
        return "A circle with radius= " + getRadius() + ", which is a subclass of " + super.toString();
    }
}
