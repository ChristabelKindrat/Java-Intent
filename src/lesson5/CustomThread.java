package lesson5;

import java.util.List;
import java.util.Objects;

public class CustomThread extends Thread {

    @Override
    public void run() {
        System.out.println("Custom thread is running, name: " + Thread.currentThread().getName());
    }

    public void takeEven(int number, Result result) {
        if (Objects.isNull(result)) {
            throw new IllegalArgumentException("SHAPE_CAN_NOT_BE_NULL");
        }
        if ((number % 2) == 0) {
            result.setNumber(number);
        }
    }

    public synchronized void numbersBetween(int startNumber, int finishedNumber, List<Integer> primes) {
        if (startNumber <= 1) {
            startNumber = 2;
        }
        for (int i = startNumber; i <= finishedNumber; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(i);
            }
        }
    }
}
