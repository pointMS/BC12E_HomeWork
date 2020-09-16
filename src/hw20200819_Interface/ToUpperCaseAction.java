package hw20200819_Interface;

public class ToUpperCaseAction implements Action {
    public ToUpperCaseAction() {
    }

    public String doAction(String s) {
        return s == null ? null : s.toUpperCase();
    }
}
