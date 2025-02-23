/*
1. Check Positive Number: 
 Task: Create a flowchart to check whether a number is positive. 
 Next Step: Write a Java program that checks if a predefined number is positive using an 
 if-else statement and prints the appropriate message.
*/

/*
Flowchart

1. Start
2. Initialize the variable (i.e. a =5).
3. Check if a > 0.
	If true, print "number is positive."
	Otherwise, print "number is not positive."
5. stop 
*/

public class CheckPositiveNumber {
    public static void main(String[] args) {
        
        int a = 5;  

        // 2. Check if 'a' is greater than zero
        if (a > 0) {
            System.out.println(a + " is positive.");
        } else {
            System.out.println(a + " is not positive.");
        }
    }
}
