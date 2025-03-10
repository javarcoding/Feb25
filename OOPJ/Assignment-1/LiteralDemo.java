/*
5. Write a program to demonstrate binary, octal, hexadecimal, 
and floating-point literals in Java.
*/

public class LiteralDemo {
    public static void main(String[] args) {
        // Binary literal 
        int binaryNum = 00001010; 

        // Octal literal (prefix: 0)
        int octalNum = 012; // 10 in decimal

        // Hexadecimal literal (prefix: 0x)
        int hexNum = 0xA; // 10 in decimal

        // Floating-point literals
        float floatNum = 10.5f; // 'f' suffix for float
        double doubleNum = 20.99; // Default is double
        double scientificNum = 3.14e2; // Scientific notation (3.14 × 10^2 = 314.0)

        // Displaying values
        System.out.println("Binary Literal (00001010) = " + binaryNum);
        System.out.println("Octal Literal (012) = " + octalNum);
        System.out.println("Hexadecimal Literal (0xA) = " + hexNum);
        System.out.println("Float Literal (10.5f) = " + floatNum);
        System.out.println("Double Literal (20.99) = " + doubleNum);
        System.out.println("Scientific Notation (3.14e2) = " + scientificNum);
    }
}
