package hw20200926_Beginner6;
//Дан массив целых чисел. Вернуть сумму двух первых элементов массива. Если длина массива меньше двух,
// вернуть сумму всех элементов. Вернуть 0, если длина массива равна нулю.

public class Task6 {
    public static void main(String[] args) {
        System.out.println(sum2(new int[]{1, 2, 3}));
        System.out.println(sum2(new int[]{1, 1}));
        System.out.println(sum2(new int[]{1, 1, 1, 1}));
        System.out.println(sum2(new int[]{}));
    }

    public static int sum2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length >= 2) {
            return nums[0] + nums[1];
        } else
            return nums[0];
    }
}
