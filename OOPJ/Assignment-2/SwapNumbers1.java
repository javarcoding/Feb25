/*
Q4:  Write a program to find whether a given number is  divisible by 3  without using the 
modulus (  %  ) or division (  /  ) operators. 
Hint  : Use  subtraction and bitwise shifts
*/

import java.util.Scanner;

public class SwapNumbers1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number a= ");
		int a=sc.nextInt();
		System.out.println("Enter the number b= ");
		int b=sc.nextInt();
		
		System.out.println();
		
		System.out.println("Before swaping: ");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		a=a+b;
		b=a-b;
		a=a+b;
		
		System.out.println("After swaping: ");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		
	
	
	
	}



}