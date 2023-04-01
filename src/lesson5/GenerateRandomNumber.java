package lesson5;

import java.util.Random;

public class GenerateRandomNumber {
   public static int generateNumber(){
       Random random = new Random();
       int num = random.nextInt(100) + 1;
       return num;
   }
}
