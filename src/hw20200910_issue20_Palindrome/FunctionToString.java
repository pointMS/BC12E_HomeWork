package hw20200910_issue20_Palindrome;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class FunctionToString implements UnaryOperator<List<String>> {
    Predicate predicate;

    public FunctionToString(Predicate predicate) {
        this.predicate = predicate;
    }

    @Override
    public List<String> apply(List<String> strings) {
        List<String> res = new ArrayList<>();
        if (strings == null) return res;
        for (String element : strings) {
            if (predicate.test(element)){
                res.add(element);
            }
        }
        return res;
    }
}
