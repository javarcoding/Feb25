//Snippet 12:  
/*
public class Main12 { 
    public static void main(String[] args) { 
        while (true) { 
            System.out.println("Infinite Loop"); 
        } 
    } 
} 
*/
//What happens when you run this code? How can you avoid infinite loops?

//Corrected code-
public class Main12 { 
    public static void main(String[] args) { 
        int count = 0;
        while (count < 10) { 
            System.out.println("Loop iteration " + count); 
            count++;
        } 
    } 
}
