public class SwapNumbers {
    public static void main(String[] args) {
        int first = 10, second = 20;

        System.out.println("Before swapping:");
        System.out.println("First number: " + first);
        System.out.println("Second number: " + second);

        // Swapping without a third variable
        first = first + second;
        second = first - second;
        first = first - second;

        System.out.println("\nAfter swapping:");
        System.out.println("First number: " + first);
        System.out.println("Second number: " + second);
    }
}
