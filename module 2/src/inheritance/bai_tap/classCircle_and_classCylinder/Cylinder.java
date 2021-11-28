package inheritance.bai_tap.classCircle_and_classCylinder;

public class Cylinder extends Circle{
    private int height;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, int height) {
        super(radius, color);
        this.height = height;
    }


    public double getVolume() {
        return 3.14 * Math.pow(super.getRadius(),2) * this.height;
    }

    public String toString() {
        return "Height: " + this.height + ", Volume: " + getVolume() + " " +super.toString();
    }
}
