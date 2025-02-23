//Snippet 3:  
/*
public class DoWhileIncorrectCondition { 
    public static void main(String[] args) { 
        int num = 0; 
        do { 
            System.out.println(num); 
            num++; 
        } while (num > 0); 
 
 
    } 
} 
*/
// Error to investigate: Why does the loop only execute once? What is wrong with the loop condition in the `do-while` loop? 

/*
Ans:-
loop does not execute just once; it will keep going forever (an infinite loop) Since num++ in do block and while condition num > 0.
*/

//Corrected code:-

public class DoWhileIncorrectCondition { 
    public static void main(String[] args) { 
        int num = 0; 
        do { 
            System.out.println(num); 
            num++; 
        } while (num < 5); 
 
 
    } 
}