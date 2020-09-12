package calculator;

/**
 * Calculator 11.08.2020
 */
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Result of addition: " + getAddition(5, 8));
        System.out.println("Result of subtraction: " + getSubtraction(12, 3));

    }

    public static int getAddition(int a, int b) {
        return a + b;
    }

    public static int getSubtraction(int a, int b) {
        return a - b;
    }
}
