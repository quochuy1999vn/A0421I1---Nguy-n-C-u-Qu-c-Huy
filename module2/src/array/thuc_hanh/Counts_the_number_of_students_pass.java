package array.thuc_hanh;

import java.util.Scanner;

public class Counts_the_number_of_students_pass {
    public static void main(String[] args) {
        int[] arr;
        int size;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter size for array: ");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.print("Size should not exceed 30");
            }
        }while (size > 30 && size <= 0);

        arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element [" + (i+1) + "]: ");
            arr[i] = scanner.nextInt();
        }

        int count = 0;
        System.out.print("List of mark: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] >= 5 && arr[i] <= 10) {
                count++;
            }
        }
        System.out.print("\nThe number of students passing the exam is: " + count);
    }
}
