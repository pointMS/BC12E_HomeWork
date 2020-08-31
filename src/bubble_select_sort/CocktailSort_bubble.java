package bubble_select_sort;

import java.util.Arrays;

public class CocktailSort_bubble {
    public static void main(String[] args) {

        int[] arr = {25, 18, -2, 89, 200, 57, 648, 1, 82, 324};

        System.out.println("Nor sorted: " + Arrays.toString(arr));

        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = arr.length-1; j >= 1; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println("Sorted: " + Arrays.toString(arr));
    }
}
