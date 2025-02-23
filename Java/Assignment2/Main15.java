//Snippet 15:  
/*
public class Main15 { 
    public static void main(String[] args) { 
        int num1 = 10; 
        double num2 = 5.5; 
        int result = num1 + num2; 
        System.out.println(result); 
    } 
} 
*/
//What error occurs when compiling this code? How should you handle different data types 
//in operations?

//Corrected code-

public class Main15 { 
    public static void main(String[] args) { 
        int num1 = 10; 
        double num2 = 5.5; 
        double result = num1 + num2; // Now result is of type double
        System.out.println(result); 
    } 
}
