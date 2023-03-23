package lesson2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = { 5, 2, 42, 6, 1, 3, 2 };

        BubbleSort sort = new BubbleSort(array);
        System.out.println(Arrays.toString(sort.sortFromMax()));
        System.out.println(Arrays.toString(sort.sortFromMin()));
    }
}
