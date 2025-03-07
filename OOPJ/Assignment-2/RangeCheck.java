/*
Q9:  Implement a Java program that checks if a number is  within a specific range (20 to 
50)  without using  if-else  . 
Hint  : Use  logical AND (  &&  ) in a print statement
*/

import java.util.Scanner;

class RangeCheck{

	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		
		boolean isInRange = (a >= 20 && a <= 50);
		
		System.out.println("is the number in the range 20 to 50?  : "+isInRange);
		
		sc.close();
	
	}
}