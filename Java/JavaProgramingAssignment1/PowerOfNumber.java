public class PowerOfNumber {
    public static void main(String[] args) {
        int base = 3;
        int exponent = 4;
        long result = 1; // Use long to handle larger results

        for (int i = 1; i <= exponent; i++) {
            result *= base;  // Multiply result by the base in each iteration
        }

        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}
