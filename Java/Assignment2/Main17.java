//Snippet 17:  
/*
public class Main17 { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = a ** b; 
        System.out.println(result); 
    } 
}
*/ 
//What compilation error occurs? Why is the ** operator not valid in Java?

//Corrected code-
public class Main17 { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = a * b; 
        System.out.println(result); 
    } 
} 
 