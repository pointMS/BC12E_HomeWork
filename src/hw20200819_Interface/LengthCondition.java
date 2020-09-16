package hw20200819_Interface;

public class LengthCondition implements Condition {
    private int length;

    public LengthCondition(int length) {
        this.length = length;
    }

    public boolean test(String s) {
        return s != null && s.length() > this.length;
    }
}
