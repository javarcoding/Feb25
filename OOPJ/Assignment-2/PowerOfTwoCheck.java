/*
Q11:  Write a program to check if a given number is a  power of 2  using bitwise operators. 
Hint  :  n & (n - 1) == 0  for positive numbers
*/
import java.util.Scanner;

class PowerOfTwoCheck{

	public static void main(String[] main){
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the number: ");
	int n=sc.nextInt();
	
	boolean isPowerOfTwo=(n>0) && ((n &(n-1))==0);
	
	System.out.println(n+" is a power of 2: "+isPowerOfTwo);
	
	
	}


}