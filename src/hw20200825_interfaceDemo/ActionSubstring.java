package hw20200825_interfaceDemo;

public class ActionSubstring implements Action {
    @Override
    public String doAction(String str) {
        if (str == null || str == "") return null;
        return str.substring(0, 2).concat(".");
    }
}
