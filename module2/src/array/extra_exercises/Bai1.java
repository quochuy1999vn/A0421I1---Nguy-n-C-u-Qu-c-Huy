package array.extra_exercises;

import java.util.Scanner;

public class Bai1 {
//    1.	Viết chương trình thực hiện các công việc như sau :
//    a.	Nhập một mảng a gồm n phần tử kiểu nguyên int
//    b.	Tính tổng số dương lẻ của mảng a
//    c.	Nhập vào phần tử k, tìm xem k có xuất hiện trong mảng a không. Nếu có chỉ ra các vị trí của k trong mảng.
//    d.	Sắp sếp mảng a theo thứ tự tăng dần.
//    e.	Chèn một số p vào mảng a sao cho mảng a vẫn đảm bảo tăng dần.

    public static void main(String[] args) {
        int n;
        int[] a;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter n: ");
            n = sc.nextInt();
        }while (n <= 0);

        a = new int[n];

        input(a,n);
//        sumOdd(a,n);
//        sort(a);
        insertP(a,n);
        System.out.println();
        output(a);
    }

    public static void input(int[] a, int n) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element [" + (i+1) + "]: ");
            a[i] = input.nextInt();
        }
    }

    public static void output(int[] a) {
        for (int element : a) {
            System.out.print(element);
        }
    }

    public static void sumOdd(int[] a, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) {
                sum += a[i];
            }
        }
        System.out.print("Odd sum of array a: " + sum);
    }

    public static void findK(int[] a, int n) {
        int k;
        int index;
        Scanner find = new Scanner(System.in);
        System.out.print("Enter k: ");
        k = find.nextInt();

        for (int i = 0; i < n; i++) {
            if (a[i] == k) {
                index = i;
                System.out.print(k + " is in the array, index = " + index);
            }else {
                System.out.print(k + "is not in the array");
            }
        }
    }

    public static void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
         }
    }

    public static void insertP(int[] a, int n) {
        Scanner insert = new Scanner(System.in);

        int[] b = a;
        b = new int[a.length+1];

        int index;
        int p;
        System.out.print("Enter p: ");
        p = insert.nextInt();

        System.out.println("\nEnter index: ");
        index = insert.nextInt();

        for (int i = n; i < index; i--) {
            b[i] = a[i-1];
        }
        b[index] = p;


        for (int element : b) {
            System.out.print(element);
        }
    }
}
