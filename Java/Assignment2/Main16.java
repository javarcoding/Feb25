//Snippet 16:  
/*
public class Main16 { 
    public static void main(String[] args) { 
        int num = 10; 
        double result = num / 4; 
        System.out.println(result); 
    } 
} 
*/
//What is the result of this operation? Is the output what you expected?

//Corrected code-
public class Main16 { 
    public static void main(String[] args) { 
        int num = 10; 
        double result = num / 4.0; // Using 4.0 instead of 4
        System.out.println(result);  // This will print 2.5
    } 
}

