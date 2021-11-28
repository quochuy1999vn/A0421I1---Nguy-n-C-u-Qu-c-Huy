package array.bai_tap;

import java.util.Scanner;

public class SumTheNumberInaSpecifiedColumn {
    public static void main(String[] args) {
        int row, col;
        int[][] arr;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter col: ");
        col = input.nextInt();

        System.out.print("Enter row: ");
        row = input.nextInt();

        arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                arr[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        int x;

        System.out.print("Enter col desire: ");
        x = input.nextInt();

        for (int i = 0; i < row; i++) {
            sum += arr[i][x];
        }

        System.out.print("Sum: " + sum);
    }
}
