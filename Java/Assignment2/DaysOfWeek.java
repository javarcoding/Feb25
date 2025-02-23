/*
Question 2: Days of the Week  
Write a program that uses a nested switch statement to print out the day of the week based on an integer input (1 for Monday, 2 for Tuesday, etc.). Additionally, within each day, print whether it is a weekday or weekend. 
*/

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for the day of the week (1 for Monday, ..., 7 for Sunday): ");
        int day = scanner.nextInt();
        
        switch(day) {
            // For days 1-5, these are weekdays.
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                // Nested switch to print the day name for weekdays.
                switch(day) {
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                }
                System.out.println("Weekday");
                break;
                
            // For days 6-7, these are weekends.
            case 6:
            case 7:
                // Nested switch to print the day name for weekends.
                switch(day) {
                    case 6:
                        System.out.println("Saturday");
                        break;
                    case 7:
                        System.out.println("Sunday");
                        break;
                }
                System.out.println("Weekend");
                break;
                
            default:
                System.out.println("Invalid day");
                break;
        }
        
        scanner.close();
    }
}
