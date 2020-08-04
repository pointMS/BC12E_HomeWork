package bubble_select_sort;

/**
 * B12E_Repeat 29.06.2020
 */
public class test_exersice {
    public static void main(String[] args) {
        int[] array = {2, 7, 3, 5, 6};
        int sum = 12;
        int sum1 = 20;
        System.out.println(findInt(array, sum)); //true
        System.out.println(findInt(array, sum1)); //false

    }

    public static boolean findInt(int[] arr, int a) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (i != j && arr[i] + arr[j] == a)
                    return true;
            }
        }
        return false;
    }
}
