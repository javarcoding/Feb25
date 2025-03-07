/*
Q8:  Write a program that  takes three boolean inputs  and prints  true  if at least two of 
them are  true  . 
Hint  : Use logical operators (  &&  ,  ||  ).
*/
import java.util.Scanner;
class AtLeastTwoTrue{

	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first boolean value (True/false):");
		boolean a=sc.nextBoolean();
		
		System.out.println("Enter second boolean value (True/false):");
		boolean b=sc.nextBoolean();
		
		System.out.println("Enter third boolean value (True/false):");
		boolean c=sc.nextBoolean();
		
		boolean result=(a && b)||(b && c)||(a && c);
		
		System.out.println("At least two inputs are true:"+ result);
		
		sc.close();
	}
}
