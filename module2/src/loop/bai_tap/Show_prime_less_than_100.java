package loop.bai_tap;

public class Show_prime_less_than_100 {

    public static boolean isPrimeNumber(int n) {
        // số nguyên < 2 không phải là số nguyên tố
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

    public static void main(String[] args) {
        int i = 2;
        System.out.print("Các số nguyên tố nhỏ hơn 100: ");
        while (i <= 100) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
