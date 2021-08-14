package inheritance.thuc_hanh.geometric_objects;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.print(shape);

        shape = new Shape("Red", false);
        System.out.println(shape);
    }
}
