/*
Q12:  Write a Java program to  multiply a number by 8  without using  *  or  /  operators. 
Hint  : Use bitwise left shift (  <<  ). 
*/
import java.util.Scanner;

class MultiplyByEight{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();

		int result=num<<3; // Left shifting by 3 places (equivalent to multiplying by 8)
		
		System.out.println(num+" multiplied by 8 is: "+ result);
		
		
	
	}

}

/*

Bitwise Left Shift (<<):

The left shift operator (<<) shifts all bits to the left by a given number of positions.
Each left shift by 1 doubles the number.
Since 8 = 2³, shifting left by 3 (<< 3) multiplies the number by 8.

num << 3  →  num × 2³  →  num × 8

5 << 3  →  5 × 8  →  40
*/