/*
3. Write a program to convert a double value to int using 
typecasting and explain the data loss.

*/

public class DoubleToInt {
    public static void main(String[] args) {
        double doubleValue = 10.75; // Double value
        int intValue = (int) doubleValue; // Explicit typecasting

        System.out.println("Double Value: " + doubleValue);
        System.out.println("Integer Value (After Typecasting): " + intValue);
    }
}
