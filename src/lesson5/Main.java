package lesson5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //Join method of thread:

        Result result = new Result(); //Create new obj

        int num_first = GenerateRandomNumber.generateNumber(); //Generate random number
        CustomThread firstThead = new CustomThread();
        firstThead.takeEven(num_first, result);
        firstThead.start();

        try {
            firstThead.join(); //Wait when active thead will be finished
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        int num_second = GenerateRandomNumber.generateNumber(); //Generate random number
        CustomThread secondThead = new CustomThread();
        secondThead.takeEven(num_second, result);
        secondThead.start();

        System.out.println(result.getNumber()); //Show result number

        //Wait & Notify methods:

        final int startNumber = 1;
        final int finishedNumber = 100;
        List<Integer> primes = new ArrayList<>();

        CustomThread thirdThead = new CustomThread(); //Create and start new Thread
        thirdThead.start();

        synchronized (thirdThead) {
            thirdThead.wait(); //Wait when numbers filtered and adds/not add to arrayList
        }
        thirdThead.numbersBetween(startNumber, finishedNumber, primes);
        
         synchronized (thirdThead) {
            thirdThead.notify(); ////Restore thead and finish a program
        }

        System.out.println(primes); //Show all prime numbers
        System.out.println("Prime numbers between " + startNumber + " and " + finishedNumber);
    }
}


