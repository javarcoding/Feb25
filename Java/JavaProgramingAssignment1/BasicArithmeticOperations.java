import java.util.Scanner;

public class BasicArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = sc.nextInt();

        System.out.print("Input second number: ");
        int num2 = sc.nextInt();

        // Addition
        int sum = num1 + num2;
        // Subtraction
        int difference = num1 - num2;
        // Multiplication
        int product = num1 * num2;
        // Division (integer division)
        int quotient = num1 / num2;
        // Remainder (modulus)
        int remainder = num1 % num2;

        // Print results
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + difference);
        System.out.println(num1 + " x " + num2 + " = " + product);
        System.out.println(num1 + " / " + num2 + " = " + quotient);
        System.out.println(num1 + " mod " + num2 + " = " + remainder);

    }
}
