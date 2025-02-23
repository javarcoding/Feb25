public class FibonacciSequence{
    
  public static void main(String[] args){
      
	int n=21;
	int a=0, b=1, c;
	
	System.out.print("Fibonacci sequence up to 21: ");

	while (true) {
            c = a + b;   
            if (c > 21) {
                break;       
            }
            System.out.print(c + " ");

            // Shift the terms for the next iteration
            a = b;
            b = c;
        }

  }

}