package interfaceDemo;

public class ConditionStartsWith implements Condition{
    String firstLetter;
    @Override
    public boolean test(String str) {
        return (str != null && str.startsWith("p"));
    }
}
