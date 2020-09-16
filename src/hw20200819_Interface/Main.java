package hw20200819_Interface;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"nn", "strawberry", "peach", "grapes", "apple", "plum", "cherry", "pineapple"};
        StringArrayHandler stringArrayHandler1 = new StringArrayHandler(strings, new ToUpperCaseAction(), new FirstLetterCondition("c"));
        stringArrayHandler1.ArraysHandle();
        System.out.println(stringArrayHandler1.toString());
        StringArrayHandler stringArrayHandler2 = new StringArrayHandler(strings, new SubstringConcatAction(3), new FirstLetterCondition("p"));
        stringArrayHandler2.ArraysHandle();
        System.out.println(stringArrayHandler2.toString());
        StringArrayHandler stringArrayHandler3 = new StringArrayHandler(strings, new SubstringConcatAction(4), new LengthCondition(6));
        stringArrayHandler3.ArraysHandle();
        System.out.println(stringArrayHandler3.toString());
    }
}