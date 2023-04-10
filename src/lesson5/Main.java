package lesson5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //Join method of thread:

        Result result = new Result();

        int num_first = GenerateRandomNumber.generateNumber();
        CustomThread firstThead = new CustomThread();
        firstThead.takeEven(num_first, result);
        firstThead.start();

        try {
            firstThead.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        int num_second = GenerateRandomNumber.generateNumber();
        CustomThread secondThead = new CustomThread();
        secondThead.takeEven(num_second, result);
        secondThead.start();

        System.out.println(result.getNumber());

        //Wait & Notify methods:

        final int startNumber = 1;
        final int finishedNumber = 100;
        List<Integer> primes = new ArrayList<>();

        CustomThread thirdThead = new CustomThread();
        thirdThead.start();

        synchronized (thirdThead) {
            thirdThead.wait();
            thirdThead.numbersBetween(startNumber, finishedNumber, primes);
        }

        synchronized (thirdThead) {
            thirdThead.notify();
            System.out.println(primes);
        }

        System.out.println("Prime numbers between " + startNumber + " and " + finishedNumber);
    }
}


