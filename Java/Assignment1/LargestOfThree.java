/*
7. Find the Largest of Three Numbers: 
    Task: Create a flowchart to find the largest of three numbers. 
    Next Step: Write a Java program that finds and prints the largest of three predefined 
    numbers using if-else statements. 
*/

/*
1.Start the process.
2.Initialize three variables a, b, and c.
3.Compare a with b.
   If a >= b, compare a with c.
   If a >= c, a is the largest.
   Else, c is the largest.
   Else (b > a), compare b with c.
   If b >= c, b is the largest.
   Else, c is the largest.
4.printing the largest number.
5.End 
*/

public class LargestOfThree {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;
        int c = 15;

        // Assume a is largest initially (alternative approach)
        int largest = a;

        //  Compare largest with b
        if (b > largest) {
            largest = b;
        }

        // Compare largest with c
        if (c > largest) {
            largest = c;
        }

        // Print the largest number
        System.out.println("The largest number is: " + largest);
    }
}
