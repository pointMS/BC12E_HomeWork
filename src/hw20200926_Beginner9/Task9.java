package hw20200926_Beginner9;

import java.util.Arrays;

//Вернуть массив, смещенный влево на один индекс. То есть, для  {6, 2, 5, 3} вернуть {2, 5, 3, 6}.
// Можно вернуть измененный данный массив, а можно вернуть новый.
public class Task9 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shiftLeft(new int[]{6, 2, 5, 3})));
        System.out.println(Arrays.toString(shiftLeft(new int[]{1, 2})));
        System.out.println(Arrays.toString(shiftLeft(new int[]{1})));
        System.out.println(Arrays.toString(shiftLeft(new int[]{1, 4, 8, 9, 10, 5})));
    }

    public static int[] shiftLeft(int[] nums) {
        int toEnd = nums[0]; //fix the first element
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = toEnd;
        return nums;
    }
}
