package array.thuc_hanh;

import java.util.Scanner;

public class dao_nguoc_cac_phan_tu_cua_mang {
    public static void main(String[] args) {
        int[] array;
        int size;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter size of array: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.print("Size does not exceed 20");
            }
        }while (size > 20);

        array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element [" + (i+1) + "]: ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Element in array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        for (int j = 0; j < size / 2; j++) {
            int temp = array[j];
            array[j] = array[size-1-j];
            array[size-1-j] = temp;
        }

        System.out.print("Reverse array: ");
        for (int j = 0; j < size; j++) {
            System.out.print(array[j] + " ");
        }
    }
}
