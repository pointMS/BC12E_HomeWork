package compare;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        String[] names = {"One", "Two", "Three", "Four", "Five"};
//        System.out.println(names[0].compareTo(names[3]));
//
//        Arrays.sort(names);
//        System.out.println(Arrays.toString(names));

        Person[]people = {new Person(18,"Tom25"),
                new Person(36,"Bob888"),
                new Person(6,"Bob2"),
                new Person(6,"Bob9"),
                new Person(24, "Anna36987"),
                new Person(47, "Anna98721"),
                new Person(31,"Nick876"),
                new Person(11,"Nick6")};

        //System.out.println(people[0].compareTo(people[2]));
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));

    }
}
