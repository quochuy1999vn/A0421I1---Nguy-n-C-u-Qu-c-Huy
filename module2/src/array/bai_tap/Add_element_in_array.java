package array.bai_tap;

import java.util.Scanner;

public class Add_element_in_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        int x;
        int index;

        for (int i = 0; i < 5; i++) {
            System.out.print("Nhập phần tử thứ [" +(i+1) + "]: ");
            arr[i] = input.nextInt();
        }

        System.out.print("Mảng trước khi thêm phần tử: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.print("\nNhập phần tử muốn chèn: ");
        x = input.nextInt();

        System.out.print("Nhập ví trí muốn chèn: ");
        index = input.nextInt();



        for (int i = 5; i > index; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = x;

        System.out.print("Mảng sau khi thêm phần tử: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
