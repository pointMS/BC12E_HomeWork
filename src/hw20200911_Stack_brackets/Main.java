package hw20200911_Stack_brackets;

public class Main {
    //определить правильность расстановки скобок в строке, метод boolean, plus tests

    public static void main(String[] args) {

        String str1 = "[{(...)}]"; //true
        String str2 = "[({...)]}"; //false
        String str3 = "[{(.]..)}"; //false
        String str4 = "noAnyBrackets"; //false

        CheckBrackets check1 = new CheckBrackets();
        System.out.println(check1.checkIfBracketsCorrect(str1));

        CheckBrackets check2 = new CheckBrackets();
        System.out.println(check2.checkIfBracketsCorrect(str2));

        CheckBrackets check3 = new CheckBrackets();
        System.out.println(check3.checkIfBracketsCorrect(str3));

        CheckBrackets check4 = new CheckBrackets();
        System.out.println(check4.checkIfBracketsCorrect(str4));
    }
}
