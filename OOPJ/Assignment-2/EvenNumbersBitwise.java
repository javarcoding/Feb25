/*
Q24:  Write a program that prints  all even numbers from 1 to 100  using only  bitwise AND 
(  &  )  and  for  loop.
*/

public class EvenNumbersBitwise {
    public static void main(String[] args) {
        System.out.println("Even numbers from 1 to 100:");

        for (int i = 1; i <= 100; i++) {
            // Using bitwise AND to check even numbers
            if ((i & 1) == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
