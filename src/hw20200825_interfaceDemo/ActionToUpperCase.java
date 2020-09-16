package hw20200825_interfaceDemo;

public class ActionToUpperCase implements Action {
    @Override
    public String doAction(String str) {
        if(str == null) return null;
        return str.toUpperCase();
    }
}
