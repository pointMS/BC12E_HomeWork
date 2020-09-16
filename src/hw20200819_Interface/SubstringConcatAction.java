package hw20200819_Interface;

public class SubstringConcatAction implements Action {
    private int index;

    public SubstringConcatAction(int index) {
        this.index = index;
    }

    public String doAction(String s) {
        if (s == null) {
            return null;
        } else {
            return s.length() < this.index ? s : s.substring(0, this.index).concat(".");
        }
    }
}
