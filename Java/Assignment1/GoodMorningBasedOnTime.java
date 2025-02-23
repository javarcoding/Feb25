/*
4. Display Good Morning Message Based on Time: 
   Task: Create a flowchart to display a "Good Morning" message based on a given time. 
   Next Step: Write a Java program that displays a "Good Morning" message if the 
   predefined time is between 5 AM and 12 PM. Use an if statement to implement the logic.

*/

/*
flowchart-

1.Start 
2.Initialize the variable time (an integer representing the hour, e.g., 9 for 9 AM).
3.Check if time is between 5 and 12 (i.e., time >= 5 && time < 12).
    If true, print "Good Morning".
    Otherwise, do nothing or display a different message (optional).
4.End 

*/

public class GoodMorningBasedOnTime {
    public static void main(String[] args) {
        // 1. Initialize a predefined time (hour in 24-hour format)
        int time = 9; 

        // 2. Check if the time is between 5 AM (05:00) and 12 PM (11:59)
        if (time >= 5 && time < 12) {
            System.out.println("Good Morning");
        }
        else {
            System.out.println("It's not morning now.");
        }
    }
}
