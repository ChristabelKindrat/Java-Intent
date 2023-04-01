package lesson5;

public class Result {
    private int result;

    public synchronized void setNumber(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) { //Check if number is natural and set to obj
            if (number % i == 0) {
                System.out.println("Number is not a natural number!");
            }
        }
        this.result += number;
    }

    public int getNumber() {
        return result;
    }
}
