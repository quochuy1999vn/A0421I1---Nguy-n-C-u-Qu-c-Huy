package loop.thuc_hanh;

import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner sc = new Scanner(System.in);

        // nhập số tiền gửi
        System.out.print("Enter investment amount: ");
        money = sc.nextDouble();

        System.out.print("Enter month: ");
        month = sc.nextInt();

        // Nhập lãi suất
        System.out.print("Enter annual interest rate in percentage: ");
        interestRate = sc.nextDouble();

        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += month * (interestRate/100)/12 * month;
        }

        System.out.print("Total of interest: " + totalInterest);
    }
}
