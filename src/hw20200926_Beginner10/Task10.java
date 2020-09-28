package hw20200926_Beginner10;
//Даны две строки, вернуть их конкатенацию, но без первого символа в каждой. Строки ненулевой длины.

public class Task10 {
    public static void main(String[] args) {

        System.out.println(nonStart("Hello", "There"));
        System.out.println(nonStart("java", "code"));
        System.out.println(nonStart("short", "java"));
    }

    public static String nonStart(String a, String b) {
        return a.substring(1).concat(b.substring(1));
    }
}
