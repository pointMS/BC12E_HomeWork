package hw20200819_Interface;

public class FirstLetterCondition implements Condition {
    private String letter;

    public FirstLetterCondition(String letter) {
        this.letter = letter;
    }

    public boolean test(String s) {
        return s != null && s.startsWith(this.letter);
    }
}
