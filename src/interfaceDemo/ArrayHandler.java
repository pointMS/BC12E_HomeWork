package interfaceDemo;

import java.util.Arrays;

public class ArrayHandler {
    private String[] strings;
    private Action action;
    private Condition condition;

    public ArrayHandler(String[] string, Action action, Condition condition) {
        this.strings = string;
        this.action = action;
        this.condition = condition;
    }

    public String[] getStrings() {
        return strings;
    }

    @Override
    public String toString() {
        return Arrays.toString(strings);
    }

    public void arraysHandle() {
        if (this.strings == null || this.action == null) return;
        for (int i = 0; i < strings.length; i++) {
            if (condition == null || condition.test(strings[i])) {
                strings[i] = action.doAction(strings[i]);
            }
        }
    }
}
