public class SumOfDigits {
    public static void main(String[] args) {
        int n = 9876;
        int sum = 0;
	

        while (n != 0) {
            int a = n % 10;  // get the last digit
	    
	    System.out.print("("+a +"+");
            sum = sum + a;    // add it to the sum
            n = n / 10;            // remove the last digit
        }
	System.out.println(sum);

     }
}
