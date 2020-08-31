package bubble_select_sort;

import java.util.Arrays;

public class CocktailSortString {
    public static void main(String[] args) {
        String[] strings = {"one", "X", "two", "three","MN", "A", "N", "B"};

        System.out.println("Not sorted: " + Arrays.toString(strings));

        String temp = "";
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = strings.length - 1; j >= 1; j--) {
                if (strings[j].compareTo(strings[j - 1]) < 0) {
                    temp = strings[j];
                    strings[j] = strings[j - 1];
                    strings[j - 1] = temp;
                }
            }
        }
        System.out.println("Sorted: " + Arrays.toString(strings));
    }
}
