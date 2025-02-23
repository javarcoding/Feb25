//Snippet 14:  
/*
public class Main14 { 
    public static void main(String[] args) { 
        double num = "Hello"; 
        System.out.println(num); 
    } 
} 
*/
//What compilation error occurs? Why does Java enforce data type constraints?

//Corrected code
public class Main14 { 
    public static void main(String[] args) { 
        String num = "Hello"; 
        System.out.println(num); 
    } 
} 