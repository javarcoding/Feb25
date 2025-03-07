import java.util.Scanner;

public class SwapNumbers{

	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();   //5
		int b=sc.nextInt();   //3
		
		System.out.println("Before Swapping:");
		System.out.println("a = "+a);
		System.out.println("b= "+b);
		
		a=a^b;   
		b=a^b;
		a=a^b;
		
		System.out.println("After Swapping:");
		System.out.println("a = "+a);
		System.out.println("b= "+b);
		
		sc.close();
		
		
	}

}

/*
		5 in binary  0101
		3 in binary  0011
		
		a=a^b
			0101    (5)
		^	0011    (3)     (XOR  1 1 =0; 0 0 =0; 1 0=1; 0 1=1)
		-----------
		    0110    (6)
			
		b=a^b
			0110    (6)
		^	0011    (3)
		-----------
			0101    (5)
		
		a=a^b
			0110    (6)
		^	0101
		------------
			0011    (3)
		*/
