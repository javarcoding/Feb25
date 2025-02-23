public class Pattern11{
    
  public static void main(String[] args){
      
  	int n=5;
	
	//for second half
	for(int i=n; i>=1; i--){
	    
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

	for(int i=2; i<=n; i++){
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

	
  }

}