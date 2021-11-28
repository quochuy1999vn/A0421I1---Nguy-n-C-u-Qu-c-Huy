package abstractClass_interface.bai_tap.interfaceColorable;

public class ColorableTest {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();

        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Rectangle) {
                Colorable colorable = (Rectangle) shape;
                System.out.println(colorable.howToColor());
            }
        }

    }
}
