package array.bai_tap;

import java.util.Scanner;

public class MinElementInArray {
    public static void main(String[] args) {
        int size;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter size of array: ");
            size = input.nextInt();
        }while (size <= 0);

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element of array: ");
            arr[i] = input.nextInt();
        }

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.print("Min element of array: " + min);
    }
}
