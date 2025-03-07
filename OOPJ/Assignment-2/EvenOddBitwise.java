import java.util.Scanner;

public class EvenOddBitwise{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a=sc.nextInt();
		
		if((a&1)==0){
			System.out.println("number is Even.");
		}else{
			System.out.println("number is Odd.");
		}
		
		
	
	}

}

/*
5 in binary 0101
	0101
&	0001       (AND: 0 0= 0 ; 0 1= 0; 1 0= 0; 1 1= 1) 
---------- 
	0001       (1 -> Odd)

2 in binary 0010
	0010
&	0001       (AND: 0 0= 0 ; 0 1= 0; 1 0= 0; 1 1= 1) 
---------- 
	0000       (0 -> Odd)

*/