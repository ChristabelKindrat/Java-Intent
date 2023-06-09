package lesson2;

public class BubbleSort {
    int[] numbers;

    public BubbleSort(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] sortFromMax() {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {

                if (numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j];

                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        return numbers;
    }

    public int[] sortFromMin() {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {

                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];

                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        return numbers;
    }
}
