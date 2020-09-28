package hw20200926_Beginner11;

//Дана строка четной длины. Вернуть строку из двух центральных символов, например строка "string" превратиться в "ri".
//Длина входной строки минимум 2.
public class Task11 {
    public static void main(String[] args) {

        System.out.println(middleTwo("string"));
        System.out.println(middleTwo("code"));
        System.out.println(middleTwo("Practice"));
    }

    public static String middleTwo(String str) {
        if (str.length() % 2 == 1) return str;
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
    }
}
