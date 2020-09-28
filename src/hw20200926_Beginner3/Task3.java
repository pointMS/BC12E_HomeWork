package hw20200926_Beginner3;
//Дана строка, вернуть новую строку, где последние 3 символа в верхнем регистре
//(заглавные). Если строка длины меньше 3, перевести это в заглавные.

public class Task3 {
    public static void main(String[] args) {
        System.out.println(endUp("Hello"));
        System.out.println(endUp("hi there"));
        System.out.println(endUp("hi"));
    }
    public static String endUp(String str) {
        if(str.length() == 0) return str;
        if (str.length() > 3) {
            return str.substring(0, str.length() - 3).concat(str.substring(str.length() - 3).toUpperCase());
        } else return str.toUpperCase();
    }
}
