package loop.bai_tap;

public class Hien_thi_cac_loai_hinh {

    public static void rectangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void squareTriangle() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void  isoscelesTriangle() {
        for (int i = 7; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        rectangle();
//        squareTriangle();
        isoscelesTriangle();
    }
}
