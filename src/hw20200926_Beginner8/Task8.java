package hw20200926_Beginner8;
//Вернуть версию входного массива, где каждое нулевое значение заменено максимальным нечетным значением
//справа от нуля. Если нечетных числе справа от нуля нет, то оставляем ноль.

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(zeroMax(new int[]{0, 5, 0, 3})));
        System.out.println(Arrays.toString(zeroMax(new int[]{0, 4, 0, 3})));
        System.out.println(Arrays.toString(zeroMax(new int[]{0, 1, 0})));
        System.out.println(Arrays.toString(zeroMax(new int[]{2, 1, 4})));


    }
    public static int[] zeroMax(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                int max = 0;
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] % 2 == 1 && nums[j] > max) {
                        max = nums[j];
                    }
                }
                if (max != 0) {
                    nums[i] = max;
                }
            }
        }
        return nums;
    }
}
