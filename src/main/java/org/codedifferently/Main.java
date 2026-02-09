package main.java.org.codedifferently;
import java.util.Scanner;



public class Main {






    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?: ");
String customerName = input.nextLine();
        System.out.println("What is your budget?: ");
double budget = input.nextDouble();
input.nextLine();
        System.out.println("Enter coupon code: ");
String couponCode = input.nextLine();

        int idNumber = RandomGenerator.generateVisitId();
        double stateTax = RandomGenerator.generateRandomTax();
        double discountAmount = RandomGenerator.generateDiscountTotal();

        double firstItem = RandomGenerator.generateItemPrice();
double secondItem= RandomGenerator.generateItemPrice();
double thirdItem= RandomGenerator.generateItemPrice();

double subtotal = CalculateTax.generateSubtotal(firstItem, secondItem, thirdItem);
double taxTotal = CalculateTax.calculateTax(subtotal, stateTax);
double total = CalculateTax.totalPreDiscount(subtotal, taxTotal);
discountAmount = Receipt.applyExtraCoupon(discountAmount,couponCode);
        double discountedTotal = CalculateTax.discountAddition(total, discountAmount);
        double roundedTotal = CalculateTax.roundingUp(discountedTotal);


       Receipt.printReceipt(customerName,
               couponCode,
               idNumber,
               firstItem,
               secondItem,
               thirdItem,
               subtotal,
               taxTotal,
               discountAmount,
               roundedTotal);

       double remaining = budget - roundedTotal;
       if (remaining >= 0){
           System.out.printf("You have $%.2f left in your budget.%n" , remaining);
       }
else {
           System.out.printf("You are $%.2f over your budget!%n", Math.abs(remaining));
       }

input.close();
    }
}
