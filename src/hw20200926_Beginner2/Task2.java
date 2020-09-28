package hw20200926_Beginner2;

//Дано целое число n, вернуть абсолютную разницу между n и 21, но вернуть
//удвоенную разницу, если n больше 21.

public class Task2 {
    public static void main(String[] args) {
        System.out.println(diff21(19));
        System.out.println(diff21(10));
        System.out.println(diff21(21));
        System.out.println(diff21(25));

    }

    public static int diff21(int n) {
        if (n > 21) {
            return Math.abs((n - 21) * 2);
        } else if (n < 21) {
            return Math.abs(n - 21);
        } else return 0;
    }
}
