/*
Question 5: Student Pass/Fail Status with Nested Switch 
Write a program that determines whether a student passes or fails based on their grades in three 
subjects. If the student scores more than 40 in all subjects, they pass. If the student fails in one or 
more subjects, print the number of subjects they failed in
*/
import java.util.Scanner;

public class StudentPassFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read marks for three subjects
        System.out.print("Enter marks for subject 1: ");
        int subject1 = scanner.nextInt();
        System.out.print("Enter marks for subject 2: ");
        int subject2 = scanner.nextInt();
        System.out.print("Enter marks for subject 3: ");
        int subject3 = scanner.nextInt();
        
        // Count the number of subjects failed (score must be greater than 40 to pass)
        int failCount = 0;
        if(subject1 <= 40) {
            failCount++;
        }
        if(subject2 <= 40) {
            failCount++;
        }
        if(subject3 <= 40) {
            failCount++;
        }
        
        // Use an outer switch based on the number of failures
        switch(failCount) {
            case 0:
                System.out.println("Student passes");
                break;
            default:
                // Nested switch to print detailed failure message based on number of failed subjects
                switch(failCount) {
                    case 1:
                        System.out.println("Student fails in 1 subject");
                        break;
                    case 2:
                        System.out.println("Student fails in 2 subjects");
                        break;
                    case 3:
                        System.out.println("Student fails in all subjects");
                        break;
                }
                break;
        }
        
        scanner.close();
    }
}
