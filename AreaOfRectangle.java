/*
6. Print Area of a Rectangle: 
     Task: Create a flowchart to calculate and print the area of a rectangle. 
     Next Step: Write a Java program that calculates the area of a rectangle using the       	formula area = length * width. Use predefined values for length and width. 

*/

/*
1.Start 
2.Define two variables: length and width.
3.Calculate the area using the formula: area = length × width
4.Print the calculated area.
5.End 

*/

public class AreaOfRectangle {
    public static void main(String[] args) {
        // 1. Define the length and width
        double length = 10.0;  // You can change these values to test
        double width  = 5.0;
        
        // 2. Calculate the area
        double area = length * width;
        
        // 3. Print the result
        System.out.println("The area of the rectangle is: " + area);
    }
}
