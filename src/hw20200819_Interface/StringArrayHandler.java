package hw20200819_Interface;

import java.util.Arrays;

public class StringArrayHandler {
    private String[] strings;
    private Action action;
    private Condition condition;

    public StringArrayHandler(String[] strings, Action action, Condition condition) {
        this.strings = strings;
        this.action = action;
        this.condition = condition;
    }

    public void ArraysHandle() {
        for(int i = 0; i < this.strings.length; ++i) {
            if (this.condition.test(this.strings[i])) {
                this.strings[i] = this.action.doAction(this.strings[i]);
            }
        }

    }

    public String toString() {
        return Arrays.toString(this.strings);
    }
}
