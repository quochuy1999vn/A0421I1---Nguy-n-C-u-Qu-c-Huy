package array.bai_tap;

public class Merge_array {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9, 10};
        int[] c = new int[a.length + b.length];
        int count = 0;

        for (int i : a) {
            c[count] = i;
            count++;
        }
        for (int i : b) {
            c[count] = i;
            count++;
        }

        for (int i : c) {
            System.out.print(i + " ");
        }
    }
}
