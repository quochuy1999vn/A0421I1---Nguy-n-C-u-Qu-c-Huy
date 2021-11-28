package abstractClass_interface.bai_tap.interfaceResizeable;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shape = new Shape[2];

        shape[0] = new Circle();
        shape[1] = new Rectangle();

        for (int i = 0; i < shape.length; i++) {
            shape[i].resize(Math.random() * 99 + 1);
            System.out.println(shape[i]);
        }
    }
}
