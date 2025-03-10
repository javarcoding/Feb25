/*
13.  Write a program to accept the marks in Physics, Chemistry and Maths secured by 20 class 
students in a single Dimensional Array. Find and display the following: 
○  Number of students securing 75% and above in aggregate
*/
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numStudents = 20;
        int[][] marks = new int[numStudents][3]; // 2D array to store marks for 20 students in 3 subjects
        int count = 0;

        // Accept marks for Physics, Chemistry, and Math
        System.out.println("Enter marks (out of 100) for Physics, Chemistry, and Maths for " + numStudents + " students:");
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Student " + (i + 1) + " (Physics, Chemistry, Maths): ");
            marks[i][0] = sc.nextInt(); // Physics
            marks[i][1] = sc.nextInt(); // Chemistry
            marks[i][2] = sc.nextInt(); // Maths

            // Calculate aggregate percentage
            double aggregate = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            // Check if 75% and above
            if (aggregate >= 75.0) {
                count++;
            }
        }
        sc.close();

        // Display result
        System.out.println("Number of students securing 75% and above: " + count);
    }
}
