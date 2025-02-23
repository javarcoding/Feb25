//Snippet 2: 
 
public class DecrementingLoop { 
    public static void main(String[] args) { 
        int total = 0; 
        for (int i = 5; i > 0; i--) { 
            total += i; 
            if (i == 3) continue; 
            total -= 1; 
        } 
        System.out.println(total); 
    } 
} 
// Guess the output of this loop.

//Output-
/*
i   if   total       sop
5   f     0+5=5       -
4   f     5+4=9       -
3   T     9+3=12  
          12-1=11    11    

*/
