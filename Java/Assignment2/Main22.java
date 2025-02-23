//Snippet 22: 
/* 
public class Main22 { 
    public static void main(String[] args) { 
        static void displayMessage() { 
            System.out.println("Message"); 
        } 
    } 
} 
*/
//What syntax error occurs? Can a method be declared inside another method?

//Corrected code-
public class Main22 { 
    public static void main(String[] args) { 
        displayMessage();  // Call the method
    } 

    static void displayMessage() { 
        System.out.println("Message"); 
    } 
}
