package main.java.org.codedifferently;
import java.util.Random;
public class RandomGenerator {
  public static Random randomGen = new Random();

  public static int generateVisitId(){

      return randomGen.nextInt(9999) + 1000;
  }


































}
