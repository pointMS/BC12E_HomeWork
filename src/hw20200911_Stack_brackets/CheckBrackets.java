package hw20200911_Stack_brackets;

import java.util.Stack;

public class CheckBrackets {
    private String str;
    public boolean checkIfBracketsCorrect(String str) {
        if (str == null || str.equals("")) return false;
        Stack<Character> stack = new Stack<>();
        for (char element : str.toCharArray()) {
            switch (element) {
                case '[':
                case '{':
                case '(':
                    stack.push(element);
                    break;
                case ')':
                    if (stack.pop() == '(') return true;
                    break;
                case '}':
                    if (stack.pop() == '{') return true;
                    break;
                case ']':
                    if (stack.pop() == '[') return true;
                    break;
                default:
                    break;
            }
        }
        return false;
    }
}
