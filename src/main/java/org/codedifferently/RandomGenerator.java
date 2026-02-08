package main.java.org.codedifferently;
import java.util.Random;
public class RandomGenerator {
  public static Random randomGen = new Random();

  public static int generateVisitId(){

      return randomGen.nextInt(9000) + 1000;

  }




public static double generateItemPrices(){





      return randomGen.nextDouble(3.0, 30.00);

}






  public static double generateRandomTax(){



     return randomGen.nextDouble(0.0, 0.011);

  }

public static double generateDiscountTotal(){

      return  randomGen.nextDouble(6.00, 15.00);



  }































}
