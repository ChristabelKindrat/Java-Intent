package lesson1;

public class PrimeNumbers {
    public static String primeNumbers() {
        int from = 2;
        int to = 100;

        for (int i = from; i < to; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        return "This is prime numbers from " + from + " to "+ to + " )";
    }
}
