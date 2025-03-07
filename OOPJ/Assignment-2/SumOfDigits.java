/*
Q3:  Implement a program that calculates the  sum of digits  of an integer using  modulus 
(  %  ) and division (  /  ) operators
*/
import java.util.Scanner;

public class SumOfDigits{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number a=");
		int a=sc.nextInt();
		
		int sum=0;
		
		while(a != 0){
			sum=sum+a%10;
			a=a/10;
		
		}
		
		System.out.println("Sum of digit: "+sum);
		
		sc.close();
	}
}
