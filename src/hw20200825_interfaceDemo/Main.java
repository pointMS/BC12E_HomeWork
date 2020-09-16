package hw20200825_interfaceDemo;

import java.util.Arrays;

/*
25.08.2020
 */
public class Main {
    public static void main(String[] args) {
        String[] strings = {"paper", "play", "126", "work", "tea", "527", "pen", "table"};
        System.out.println("Base array: " + Arrays.toString(strings));

        ArrayHandler arrayHandler1 = new ArrayHandler(strings, new ActionToUpperCase(), new ConditionStartsWith());
        arrayHandler1.arraysHandle();
        System.out.println("Nr1: " + arrayHandler1.toString());

        ArrayHandler arrayHandler2 = new ArrayHandler(strings, new ActionSubstring(),new ConditionLength());
        arrayHandler2.arraysHandle();
        System.out.println("Nr2: "+ arrayHandler2.toString());

    }

}
