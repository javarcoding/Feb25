/*
2. Check Negative Number: 
   Task: Create a flowchart to check whether a number is negative.  
   Next Step: Write a Java program that checks if a predefined number is negative using an 
   if-else statement and displays the result.
*/

/*
1.Start
2.Initialize the variable  (i.e. a = -5).
3.Check if a < 0.
	If true, print "number is negative."
	Otherwise, print "number is not negative."
4.End 
*/

public class CheckNegativeNumber {
    public static void main(String[] args) {
        int a = -5; 

        // 2. Check if 'a' is less than zero
        if (a < 0) {
            System.out.println(a + " is negative.");
        } else {
            System.out.println(a + " is not negative.");
        }
    }
}
