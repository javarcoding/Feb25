/*
Question 4: Discount Calculation  
Write a program to calculate the discount based on the total purchase amount. Use the following 
criteria: 
  If the total purchase is greater than or equal to Rs.1000, apply a 20% discount. 
  If the total purchase is between Rs.500 and Rs.999, apply a 10% discount. 
  If the total purchase is less than Rs.500, apply a 5% discount. 
Additionally, if the user has a membership card, increase the discount by 5%.
*/
import java.util.Scanner;

public class DiscountCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for the total purchase amount
        System.out.print("Enter the total purchase amount (Rs.): ");
        double totalPurchase = scanner.nextDouble();
        
        // Prompt the user for membership status (true if the user has a membership card)
        System.out.print("Do you have a membership card? (true/false): ");
        boolean hasMembership = scanner.nextBoolean();
        
        // Determine the base discount percentage based on the purchase amount
        double discountPercent = 0.0;
        if (totalPurchase >= 1000) {
            discountPercent = 20;
        } else if (totalPurchase >= 500) {
            discountPercent = 10;
        } else {
            discountPercent = 5;
        }
        
        // Increase discount by 5% if the user has a membership card
        if (hasMembership) {
            discountPercent += 5;
        }
        
        // Calculate the discount amount and final amount after discount
        double discountAmount = totalPurchase * discountPercent / 100;
        double finalAmount = totalPurchase - discountAmount;
        
        // Display the discount details
        System.out.println("Discount Percentage: " + discountPercent + "%");
        System.out.println("Discount Amount: Rs. " + discountAmount);
        System.out.println("Final Amount to be paid: Rs. " + finalAmount);
        
        scanner.close();
    }
}
