package main.java.org.codedifferently;

public class CalculateTax {

public static double generateSubtotal(double firstItem, double secondItem, double thirdItem){




    return firstItem + secondItem + thirdItem;
    }

public static double calculateTax(double subtotal, double stateTax){


    return subtotal * (stateTax/100);
}

public static double totalPreDiscount(double subtotal, double taxTotal){


 return subtotal + taxTotal;
}

public static double discountAddition(double total, double discountAmount){



    return total - discountAmount;
}

public static double roundingUp(double discountedTotal){


    return Math.round(discountedTotal * 100.0)/100.0;
}


























}
