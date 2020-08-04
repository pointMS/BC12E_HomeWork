package bubble_select_sort;

/**
 * B12E_Repeat 28.06.2020
 */
public class SelectSort {
    public static void main(String[] args) {

        int[] arr = new int[]{3, 6, 9, 2, 6};
        print(arr);
        selectSort(arr);
        System.out.println(test(arr));
        print(arr);

    }

    private static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = getMinIndex(arr, i);
            if (minIndex != i) {//нашли минимальный элемент
                swap(arr, i, minIndex);//если надо - поменяли
            }
        }
    }

    //вспомогательный метод по нахождению минимлаьного элемента
    private static int getMinIndex(int[] arr, int startIndex) {
        int min = arr[startIndex];
        int iMin = startIndex;
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                iMin = i;
            }
        }
        return iMin;
    }

    //метод для обмена
    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    //метод выводит массив
    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // метод проверяет, отсортирован ли массив
    public static boolean test(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
