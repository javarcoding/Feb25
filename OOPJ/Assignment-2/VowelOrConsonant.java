/*
Q10:  Write a program to determine if a  character is a vowel  or a consonant using the 
ternary operator. 

*/
import java.util.Scanner;

class VowelOrConsonant{

	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the character: ");
		char ch=sc.next().toLowerCase().charAt(0); // Convert to lowercase for easy comparison
		
		String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
                        ? "Vowel" : ((ch >= 'a' && ch <= 'z') ? "Consonant" : "Invalid Input");
		
		System.out.println("The character "+ ch + " is a: "+result);
		
		sc.close();

	}

}

