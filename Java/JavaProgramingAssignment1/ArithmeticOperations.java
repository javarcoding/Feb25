public class ArithmeticOperations {
    public static void main(String[] args) {
        // a. -5 + 8 * 6
        System.out.println(-5 + 8 * 6); // 43
        
        // b. (55 + 9) % 9
        System.out.println((55 + 9) % 9); // 64 % 9 = 1
        
        // c. 20 + -3 * 5 / 8
        System.out.println(20 + -3 * 5 / 8); // 19
        
        // d. 5 + 15 / 3 * 2 - 8 % 3
        // 15 / 3 = 5, 5 * 2 = 10, 8 % 3 = 2, so 5 + 10 - 2 = 13
        System.out.println(5 + 15 / 3 * 2 - 8 % 3); // 13
    }
}
