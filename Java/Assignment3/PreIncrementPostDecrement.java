public class PreIncrementPostDecrement {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int result = ++a + b--;

        System.out.println("Value of a after ++a: " + a);        // 6
        System.out.println("Value of b after b--: " + b);        // 9
        System.out.println("Result of ++a + b--: " + result);    // 16
    }
}
