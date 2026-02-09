package main.java.org.codedifferently;
import java.util.Scanner;



public class Main {
Scanner input = new Scanner(System.in);






    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name? ");
String customerName = input.next();
        System.out.println("What is your budget" + "?");
double budget = input.nextDouble();
        System.out.println("Enter coupon code: ");
String couponCode = input.next();

        int idNumber = RandomGenerator.generateVisitId();
        double stateTax = RandomGenerator.generateRandomTax();
        double discountAmount = RandomGenerator.generateDiscountTotal();

        double firstItem = RandomGenerator.generateItemPrice();
double secondItem= RandomGenerator.generateItemPrice();
double thirdItem= RandomGenerator.generateItemPrice();

double subtotal = CalculateTax.generateSubtotal(firstItem, secondItem, thirdItem);
double taxTotal = CalculateTax.calculateTax(subtotal, stateTax);
double total = CalculateTax.totalPreDiscount(subtotal, taxTotal);
double discountedTotal = CalculateTax.discountAddition(total, discountAmount);
double roundedTotal = CalculateTax.roundingUp(discountedTotal);


    }
}
