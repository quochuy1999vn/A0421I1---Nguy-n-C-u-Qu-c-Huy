package loop.bai_tap;

public class show_first_20_primes {
    public static void main(String[] args) {
        System.out.print("20 số nguyên tố đầu tiên: ");
        int i = 0;
        int count = 0;
        while (count < 20) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }

    public static boolean isPrimeNumber(int n) {
        // so nguyen < 2 không phải là số nguyên
        if (n < 2) {
            return false;
        }
        // check số nguyên tố khi n >= 2
        int i = 2;
        while (i <= Math.sqrt(n)) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
