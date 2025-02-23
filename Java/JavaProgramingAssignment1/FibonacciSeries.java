public class FibonacciSeries {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1;
        int count = 10;  // We want the first 10 Fibonacci numbers

        System.out.print(n1 + " " + n2 + " ");

        // Starting from 3rd term (since we already printed the first two)
        for(int i = 3; i <= count; i++){
            int n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }
}
