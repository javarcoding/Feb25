
/*
3. Check Odd or Even Number: 
   Task: Create a flowchart to determine whether a number is odd or even. 
   Next Step: Write a Java program that checks if a predefined number is odd or even. Use 
   an if-else statement and the modulus operator (%) to determine whether the number is 
   divisible by 2 or not
*/

/*
Flowchart-
1.Start
2.Initialize the variable (i.e a= 7).
3.Compute remainder = a % 2.
4.Check if remainder == 0.
	If true, print "number is even."
	Otherwise, print "number is odd."
5.End the process.

*/

public class CheckOddEven {
    public static void main(String[] args) {
        
        int a = 7;  

        // 
        int remainder = a % 2;

        // 3. Check if the remainder is zero
        if (remainder == 0) {
            System.out.println(a + " is even.");
        } else {
            System.out.println(a + " is odd.");
        }
    }
}
