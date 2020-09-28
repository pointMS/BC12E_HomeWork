package hw20200926_Beginner7;

//Вернуть количество четных чисел в массиве целых чисел. Напомню, что оператор
//% "mod" вычисляет остаток от деления, e.g. 5 % 2 равно 1.
public class Task7 {
    public static void main(String[] args) {
        System.out.println(countEvens(new int[]{2, 1, 2, 3, 4}));
        System.out.println(countEvens(new int[]{2, 2, 0}));
        System.out.println(countEvens(new int[]{1, 3, 5}));
    }

    public static int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
