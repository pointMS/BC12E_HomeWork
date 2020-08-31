package bubble_select_sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {25, 86, 200, -14, 98, 1, 63, 52, 18};
        System.out.println("Not sorted: " + Arrays.toString(array));

        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j >= 1; j--) {
                if (array[j] < array[j - 1]) { //поменять знак для сортировки в обратном порядке
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        System.out.println("Sorted: " + Arrays.toString(array));
    }
}
