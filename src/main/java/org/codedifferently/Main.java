package main.java.org.codedifferently;
import java.util.Scanner;



public class Main {
Scanner input = new Scanner(System.in);






    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name? ");
String customerName = input.next();
        System.out.println("What is your budget" + "?");
double budget = input.nextDouble();
        System.out.println("Enter coupon code: ");
String couponCode = input.next();


        int idNumber = RandomGenerator.generateVisitId();
double stateTax = RandomGenerator.generateRandomTax();
double itemPrice = RandomGenerator.generateItemPrices();
double discountAmount = RandomGenerator.generateDiscountTotal();


        System.out.println(idNumber);

        System.out.println(discountAmount);



    }
}
