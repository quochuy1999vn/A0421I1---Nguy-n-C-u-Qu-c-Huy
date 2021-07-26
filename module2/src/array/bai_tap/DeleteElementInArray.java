package array.bai_tap;

import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        int n = 5;
        int x;
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ [" + (i+1) + "]: ");
            arr[i] = input.nextInt();
        }

        System.out.print("Các phần tử trước khi xoá: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.print("\nNhập phần tử muốn xoá: ");
        x = input.nextInt();
        for (int j : arr) {
            if (x == j) {
                for (int i = x; i < arr.length-1; i++) {
                    arr[i] = arr[i+1];
                }
            }
        }

        System.out.print("Các phần tử sau khi xoá: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
