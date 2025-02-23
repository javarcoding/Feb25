public class Paatern9 {
    public static void main(String[] args) {
       
        for (int i = 1; i <= 5; i++) {
            
            for (int j = 5; j >= 6 - i; j--) {
                System.out.print(j);
                
                if (j > 6 - i) {
                    System.out.print("*");
                }
            }
            
            System.out.println();
        }
    }
}
