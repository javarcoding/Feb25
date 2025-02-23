public class ReverseNumber{
    
  public static void main(String[] args){
      
    int n = 1234;
    int temp = n;
    int rev = 0, rem;
   
    while(temp !=0){

	rem= temp%10;
	rev= rev * 10 + rem;
	temp= temp/10;

    }
    System.out.println("Reverse Number ="+rev);

  }

}