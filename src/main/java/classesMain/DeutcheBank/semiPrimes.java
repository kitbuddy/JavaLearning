package classesMain.DeutcheBank;

public class semiPrimes {
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static boolean isSemiPrime(int n) {
        int count = 0;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                int other = n / i;

                if (isPrime(i)) count++;
                if (other != i && isPrime(other)) count++;
            }
        }
        return count == 2;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 26; i++) {
            if (isSemiPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
