package array.bai_tap;

import java.util.Scanner;

public class Sum_the_number_in_a_specified_column {
    public static void main(String[] args) {
        int row, col;
        int[][] arr;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter col: ");
        col = input.nextInt();

        System.out.print("Enter row: ");
        row = input.nextInt();

        arr = new int[col][row];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                arr[i][j] = input.nextInt();
            }
        }

        int sum = 0;
        int x;

        System.out.print("Enter col desire: ");
        x = input.nextInt();

        for (int i = 0; i < row; i++) {
            sum += arr[x][row];
        }

        System.out.print("Sum: " + sum);
    }
}
