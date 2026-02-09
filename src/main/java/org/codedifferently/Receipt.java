package main.java.org.codedifferently;

public class Receipt {

    public static String generateReceiptID(String customerName, int idNumber) {
        String cleanName = customerName.trim().toUpperCase();
        String prefix = cleanName.substring(0, Math.min(3, cleanName.length()));


        return prefix + idNumber;
    }

    public static boolean isCouponValid(String couponCode) {

        String cleanedCoupon = couponCode.trim();

        return cleanedCoupon.equalsIgnoreCase("SAVE10")
                || cleanedCoupon.equalsIgnoreCase("VIP")
                || cleanedCoupon.equalsIgnoreCase("MYSTERY");
    }

    public static double applyExtraCoupon(double discountAmount, String couponCode) {

        if (isCouponValid(couponCode)) {

            return discountAmount + 2.00;
        }


        return discountAmount;
    }

    public static void couponMessage(String couponCode) {
        if (isCouponValid(couponCode)) {
            System.out.println("Congratulations!!! Coupon applied successfully! You earned $2 more off your order! :-)");
        } else {
            System.out.println("Sorry! No valid coupon was entered! :-( ");
        }
    }

        public static void printReceipt (
                String customerName,
        String couponCode,
                int idNumber,
        double firstItem,
        double secondItem,
        double thirdItem,
        double subTotal,
        double taxTotal,
        double discountAmount,
        double roundedTotal
){

          String customerID = Receipt.generateReceiptID(customerName, idNumber);
            System.out.println("\n ====================================");
            System.out.println("    Money Mart");
            System.out.println("====================================");
            System.out.println("Customer name: " + customerName);
            System.out.println("Receipt ID: " + customerID);
            System.out.println("Coupon entered: " + couponCode);
            couponMessage(couponCode);
            System.out.println();

            System.out.printf("Item 1: $%.2f%n", firstItem);
            System.out.printf("Item 2: $%.2f%n", secondItem);
            System.out.printf("Item 3: $%.2f%n", thirdItem);

            System.out.printf("%nSubtotal: $%.2f%n", subTotal);
            System.out.printf("Tax due: $%.2f%n", taxTotal);
            System.out.printf("You saved: $%.2f%n", discountAmount);
            System.out.printf("Total: $%.2f%n", roundedTotal);

            System.out.println("====================================\n");







        }


    }


