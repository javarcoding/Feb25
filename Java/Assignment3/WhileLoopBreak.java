//Snippet 3:  
public class WhileLoopBreak { 
    public static void main(String[] args) { 
        int count = 0; 
        while (count < 5) { 
            System.out.print(count + " "); 
            count++; 
            if (count == 3) break; 
        } 
        System.out.println(count); 
    } 
} 
// Guess the output of this while loop.

//Output-
/*
count while   sop   count++ if sop
0      T     0 1 2     1     f  -
1      T               2     f  -
2      T               3     T  3 

*/