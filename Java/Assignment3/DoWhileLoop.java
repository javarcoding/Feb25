//Snippet 4:  
public class DoWhileLoop { 
    public static void main(String[] args) { 
        int i = 1; 
        do { 
            System.out.print(i + " "); 
            i++; 
        } while (i < 5); 
        System.out.println(i); 
    } 
} 
// Guess the output of this do-while loop. 

/*
i     sop     i++  while  sop
1      1       2      T     2     
2              3      T     3     
3              4      T     4     
4              5      f     - 

Output- 
*/