package array.extra_exercises;

import java.util.Scanner;

public class bai2 {
//    2.	Viết chương trình thực hiện công việc sau:
//    a.	Nhập ma trận A (m dòng, n cột) gồm các phần tử kiểu int
//    b.	Tính tích các số là bội số của 3 nằm trên dòng đầu tiên của ma trận
//    c.	Tạo ra mảng một chiều X với X[i] là các giá trị lớn nhất trên từng dòng i của ma trận A.

    public static void main(String[] args) {
        int[][] a;
        int col, row;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter row: ");
            row = input.nextInt();

            System.out.print("Enter col: ");
            col = input.nextInt();
        }while (row <= 0 || col <= 0);

        a = new int[row][col];

        input(a,col,row);
        output(a,col,row);
        multiplesOfThree(a,col,row);
//        newArrayIsMaxMatrix(a,col,row);
    }

    public static void input(int[][] a, int col, int row) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                a[i][j] = input.nextInt();
            }
        }
    }

    public static void output(int[][] a, int col, int row) {
        System.out.println("Element of matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void multiplesOfThree(int[][] a, int col, int row) {
        int volume = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (a[i][j] % 3 == 0) {
                    volume *= a[i][j];
                }
            }
            break;
        }
        System.out.print("Multiples of three: " + volume);
    }
    public static void newArrayIsMaxMatrix(int[][] a, int col, int row) {
        int[] b = new int[row];
        int max = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
               if (a[i][j] > max) {
                   max = a[i][j];
               }
            }
            b[i] = max;
        }
        for (int element : b) {
            System.out.print(element + " ");
        }
    }

}
