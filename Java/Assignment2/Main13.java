//Snippet 13:  
/*
public class Main13 { 
    public static void main(String[] args) { 
        String str = null; 
        System.out.println(str.length()); 
    } 
} 
*/
//What exception is thrown? Why does it occur?

//Corrected code-

public class Main13 { 
    public static void main(String[] args) { 
        String str = "Hello";  // now str is not null
        System.out.println(str.length()); // prints the length of the string
    } 
}
