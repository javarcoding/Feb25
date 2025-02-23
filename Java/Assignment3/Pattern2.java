public class Pattern2 {
    public static void main(String[] args) {
        
        // 1) Print from 1 up to 5
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
            	System.out.print(i);
            	if (j < i) {
                   System.out.print("*");
            	}
           }
           System.out.println(); // move to next line

        }
    
        // 2) Print from 5 down to 1
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
            	System.out.print(i);
            if (j < i) {
                System.out.print("*");
            }
        }
        System.out.println(); // move to next line

        }
     }
    
   }
