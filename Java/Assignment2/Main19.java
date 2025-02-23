//Snippet 19:  
/*
public class Main19 { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 0; 
        int result = a / b; 
        System.out.println(result); 
    } 
} 
*/
//What runtime exception is thrown? Why does division by zero cause an issue in Java?

//Corrected code-
public class Main19 { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 0; 
        
        if (b != 0) {
            int result = a / b; 
            System.out.println(result);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    } 
}
