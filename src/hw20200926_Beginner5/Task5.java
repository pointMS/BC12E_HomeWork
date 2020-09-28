package hw20200926_Beginner5;
//Даны два массива целых чисел. Вернуть true если у них одинаковый первый или
//последний элемент. Оба массива длины 1 или более.

public class Task5 {
    public static void main(String[] args) {
        System.out.println(commonEnd(new int[]{1, 2, 3}, new int[]{7, 3}));
        System.out.println(commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2}));
        System.out.println(commonEnd(new int[]{1, 2, 3}, new int[]{1, 3}));
    }

    public static boolean commonEnd(int[] a, int[] b) {
        if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
            return true;
        } else return false;
    }
}
