package bubble_select_sort;

/**
 * B12E_Repeat 28.06.2020
 */
public class StringDemo {
    public static void main(String[] args) {
        char[] chArray = {'h', 'e', 'l', 'l', 'o'};
        String s = "hello java! London. is a capital of";
        String s1 = new String("Hello");
        String s2 = new String(chArray); //создание нового объекта класса string

        System.out.println(s2);
        //перебираем массив и печатаем каждый отдельный объект
        for (char ch : chArray) {
            System.out.println(ch);
        }
        System.out.println("----------");
        System.out.println(s.compareTo(s1));
        char[] chars = s.toCharArray(); //массив char заполнен буквами из строки s
        String newString = s.substring(5);
        System.out.println(newString);
        System.out.println(newString.trim());//вырезаем пробелы
        String[] newStr2 = s.split(" ");//разбивка строки по символу -  пробелу
        String[] newStr3 = s.split("[!, \\.]");//разбивка строки по символу - ! или .

        System.out.println("----------");


        for (String qwe : newStr2) {
            System.out.println(qwe);
        }

    }
}
