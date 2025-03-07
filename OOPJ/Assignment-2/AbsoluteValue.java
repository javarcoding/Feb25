 /*
 Q13:  Implement a Java program to find the  absolute value  of an integer using bitwise 
operators. 
Hint  :  mask = num >> 31; abs = (num + mask) ^ mask;
 */
 
 import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        scanner.close();

        int mask = num >> 31;  // Extract sign bit (0 for positive, -1 for negative)
        int abs = (num + mask) ^ mask;  // Compute absolute value

        System.out.println("Absolute value: " + abs);
    }
}
