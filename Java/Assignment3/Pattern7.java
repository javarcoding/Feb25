public class Pattern7{
    
  public static void main(String[] args){
      
  	int n=5;
	
	for(int i=1; i<=n; i++){
	    //for space
	    for(int j=1; j<=n-i; j++){
		System.out.print(" ");
	    }
	
	     //for first half stars
	    for(int k=1; k<=i; k++){
		System.out.print("*");
	    }

	     //for space
	    for(int l=1; l<=i-1; l++){
		System.out.print("*");
	    }
	    System.out.println();
		
	}

	//for second half
	for(int i=n-1; i>=1; i--){
	    
	    for(int j=1; j<=n-i; j++){
		System.out.print(" ");
	    }
	
	     //for first half stars
	    for(int k=1; k<=i; k++){
		System.out.print("*");
	    }

	     //for space
	    for(int l=1; l<=i-1; l++){
		System.out.print("*");
	    }
	    System.out.println();
		
	}

  }

}