package array.thuc_hanh;

import java.util.Scanner;

public class FindElementMaxOfArray {
    public static void main(String[] args) {
        int[] array;
        int size;
        int index = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter size of array: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.print("Size does not exceed 20");
            }
        }while (size > 20);

        array = new int[size];
        // Nhập mảng
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element [" + (i+1) + "]: ");
            array[i] = scanner.nextInt();
        }
        //Xuất mảng
        System.out.print("Element in array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        //Max array
        int max = array[0];
        for (int i = 0; i < size; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        System.out.print("\nMax in array: " + max + " vị trí: " + (index+1));
    }
}
