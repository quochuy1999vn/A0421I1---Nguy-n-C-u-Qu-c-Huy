package inheritance.bai_tap.classCircle_and_classCylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2, "yellow", 3);


        System.out.println("Volume: " + cylinder.getVolume());
        System.out.println(cylinder.toString());
    }
}
