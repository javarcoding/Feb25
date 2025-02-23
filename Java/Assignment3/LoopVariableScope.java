//Snippet 12:  
/*
public class LoopVariableScope { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i++) { 
            int x = i * 2; 
        } 
        System.out.println(x); // Error: 'x' is not accessible here 
    } 
} 
*/
// Error to investigate: Why does the variable 'x' cause a compilation error? How does scope

//Corrected code-

public class LoopVariableScope {
    public static void main(String[] args) {
        int x = 0; // Declare x outside the loop
        for (int i = 0; i < 5; i++) {
            x = i * 2; // Update x inside the loop
        }
        System.out.println(x); // Now x is accessible here
    }
}
