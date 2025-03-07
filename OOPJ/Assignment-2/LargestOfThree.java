/*
Q6:  Write a program to find the  largest of three numbers  using only the  ternary operator 
(  ? : 

*/
import java.util.Scanner;

public class LargestOfThree{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number a= ");
		int a=sc.nextInt();
		System.out.println("Enter the number b= ");
		int b=sc.nextInt();
		System.out.println("Enter the number c= ");
		int c=sc.nextInt();
		
		int largest=(a>b)?((a>c)?a:c):((b>c)?b:c);
		
		System.out.println("The largest Number is: "+largest);
		
	
	}

}