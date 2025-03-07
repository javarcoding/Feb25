/*Q18:  Given a student’s percentage, print  “Pass”  if the percentage is 40 or above; 
otherwise, print  “Fail”  , using only the ternary operator.
*/

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's percentage: ");
        double percentage = scanner.nextDouble();

        // Using ternary operator to check pass/fail
        String result = (percentage >= 40) ? "Pass" : "Fail";

        System.out.println("Result: " + result);

        scanner.close();
    }
}
