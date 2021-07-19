package array.bai_tap;

import java.util.Scanner;

public class Find_max_element_in_two_dimensional_array {
    public static void main(String[] args) {
        int m, n;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter m: ");
        m = input.nextInt();

        System.out.print("Enter n: ");
        n = input.nextInt();

        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element for array [" + i + "][" + j + "]: ");
                arr[i][j] = input.nextInt();
            }
        }

        int max = arr[0][0];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }

        System.out.print("Max element in array: " + max);
    }
}
