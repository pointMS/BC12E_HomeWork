package hw20200830_PersonList;

import java.util.List;

public class Person {
    private String name;
    private Address addresses;

    public Person(String name, Address addresses) {
        this.name = name;
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Person name: " + name + ", mail: " + addresses;
    }
}
