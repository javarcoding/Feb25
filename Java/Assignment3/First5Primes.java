public class First5Primes {
    public static void main(String[] args) {
        int count = 0;     
        int number = 2;    
        
        System.out.println("The first 5 prime numbers are:");

        // Keep searching until we find 5 primes
        while (count < 5) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        // Check divisibility up to sqrt(n)
        for (int i = 2; i <= n-1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
