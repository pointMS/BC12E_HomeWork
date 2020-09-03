package hw20200901_issue19;

import java.util.ArrayList;
import java.util.List;

public class AddressListHandler {

    public static List<Person> addressListHandler(List<Person> people) {
        List<Person> resList = new ArrayList<>();
        if (people != null) {
            for (Person p : people) {
                if (p.isTheType(AddressType.BILLING)) {
                    resList.add(p);
                }
            }
        }
        return resList;
    }

}
