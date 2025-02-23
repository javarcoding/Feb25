public class LargestDigit {
    public static void main(String[] args) {
        int n = 4825;
        int largest = 0;

        while (n != 0) {
            int digit = n % 10; // Extract the last digit
            if (digit > largest) {
                largest = digit;
            }
            n = n / 10;         // Remove the last digit
        }

        System.out.println("The largest digit is: " + largest);
    }
}
