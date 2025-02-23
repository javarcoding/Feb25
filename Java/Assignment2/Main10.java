//Snippet 10:  
/*
public class Main10 { 
    public void display() { 
        System.out.println("No parameters"); 
    } 
    public void display(int num) { 
        System.out.println("With parameter: " + num); 
    } 
    public static void main(String[] args) { 
        display(); 
        display(5); 
    } 
} 
*/
//What happens when you compile and run this code? Is method overloading allowed?

//Corrected code-

public class Main10 { 
    public void display() { 
        System.out.println("No parameters"); 
    } 
    public void display(int num) { 
        System.out.println("With parameter: " + num); 
    } 
    public static void main(String[] args) { 
        Main10 obj = new Main10();  
        obj.display();  
        obj.display(5); 
    } 
}

