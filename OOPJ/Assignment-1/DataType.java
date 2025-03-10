/*1. Create a program that declares and initializes all primitive data types 
in Java and prints their default and assigned values.
*/

class DataType
{
	// Instance variable (default value)
    byte  a;
    short b;
    int c;
    long d;
    float e;
    double f;
    char g;
    boolean h; 


    public static void main(String[] args) {
        // Local variable 
        byte a1 = 100;
		short b1 = 100;
        int c1 = 1000;
        long d1 = 10000L;
        float e1 = 10.5f;
        double f1 = 20.99d;
        char g1 = 'A';
        boolean h1 = true;
        
        // Create an object to access the instance variable
        DataType obj = new DataType();

        // Print default and assigned values of byte datatype
        System.out.println("Default value of byte : " + obj.a);
        System.out.println("Assigned value of byte : " + a1);
		
		System.out.println();
		
		// Print default and assigned values of short datatype
        System.out.println("Default value of short : " + obj.b);
        System.out.println("Assigned value of short : " + b1);
		
		System.out.println();
		
		// Print default and assigned values of int datatype
        System.out.println("Default value of int : " + obj.c);
        System.out.println("Assigned value of int : " + c1);
		
		System.out.println();
		
		// Print default and assigned values of long datatype
        System.out.println("Default value of long : " + obj.d);
        System.out.println("Assigned value of long : " + d1);
		
		System.out.println();
		
		// Print default and assigned values of float datatype
        System.out.println("Default value of float : " + obj.e);
        System.out.println("Assigned value of float : " + e1);
		
		System.out.println();
		
		// Print default and assigned values of double datatype
        System.out.println("Default value of double : " + obj.f);
        System.out.println("Assigned value of double : " + f1);
		
		System.out.println();
		
		// Print default and assigned values of char datatype
        System.out.println("Default value of char : " + obj.g);
        System.out.println("Assigned value of char : " + g1);
		
		System.out.println();
		
		// Print default and assigned values of boolean datatype
        System.out.println("Default value of boolean : " + obj.h);
        System.out.println("Assigned value of boolean : " + h1);
		
		
		
		/*
        // Byte range demonstration
        byte minByte = Byte.MIN_VALUE; // -128
        byte maxByte = Byte.MAX_VALUE; // 127
        System.out.println("Minimum value of byte: " + minByte);
        System.out.println("Maximum value of byte: " + maxByte);
		*/
	
    }


}
