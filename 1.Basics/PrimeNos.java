public class PrimeNos {
    public static void main(String args[]) {
        System.out.println(prime(5));
    }

    public static boolean prime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
