/*
Q7:  Implement a Java program that checks whether a given year is a  leap year or not  using 
logical (  &&  ,  ||  ) operators
*/
import java.util.Scanner;

class LeapYearChecker{

	public static void main(String[] args){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a year: ");
	int year=sc.nextInt();
	
	// Leap year condition using logical operators
	boolean isLeap=(year %4 == 0 && year % 100 !=0)|| (year % 400 ==0);
	
	if(isLeap){
		System.out.println(year+" is a leap year");
	
	}else{
		System.out.println(year+" is not a leap year");
	}
	
	}
}