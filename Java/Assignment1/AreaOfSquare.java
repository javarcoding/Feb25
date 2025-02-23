/*
5. Print Area of a Square: 
     Task: Create a flowchart to calculate and print the area of a square. 
     Next Step: Write a Java program that calculates the area of a square using the formula 
     area = side * side. Use a predefined side length. 
*/

/*
1.Start 
2.Define a variable side with a predefined value (e.g., 5).
3.Calculate the area using the formula: area = side × side
4.Print the calculated area.
5.End 
*/

public class AreaOfSquare {
    public static void main(String[] args) {
        
        int side = 5; 
        
        // 2. Calculate the area of the square
        int area = side * side;
        
        System.out.println("The area of the square with side " + side + " is: " + area);
    }
}
