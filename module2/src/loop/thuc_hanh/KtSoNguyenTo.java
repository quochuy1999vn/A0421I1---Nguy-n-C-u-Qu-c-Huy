package loop.thuc_hanh;

import java.util.Scanner;

public class KtSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number < 2) {
            System.out.print("is not a prime");
        }else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.print("is a prime");
            }else {
                System.out.print("is NOT a prime");
            }
        }
    }
}
