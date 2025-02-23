//Snippet 6:  
/*
public class Main6 { 
    public static void main(String[] args) { 
        int x = y + 10; 
        System.out.println(x); 
    } 
} 
*/
//What error occurs? Why must variables be declared?

//Corrected code-
public class Main6 { 
    public static void main(String[] args) { 
	int y= 5;
        int x = y + 10; 
        System.out.println(x); 
    } 
} 

