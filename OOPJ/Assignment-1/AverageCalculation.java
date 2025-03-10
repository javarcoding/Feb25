/*
4. Write a program to calculate the average of three int numbers
 using typecasting to display the result in double.
*/

public class AverageCalculation {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 30; // Three integer numbers
        int avg=(num1 + num2 + num3) / 3; // Typecasting to double
		double average =avg;  
		
        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);
        System.out.println("Third Number: " + num3);
        System.out.println("Average (as double): " + average);
    }
}
