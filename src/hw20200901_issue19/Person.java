package hw20200901_issue19;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String firstName;
    private String secondName;
    private List<PersonAddress> personAddresses;

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public Person(String firstName, String secondName, List<PersonAddress> personAddresses) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.personAddresses = personAddresses;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public boolean isTheType(AddressType type) {
        for (PersonAddress p : personAddresses) {
            if (p.getType() == AddressType.BILLING) {
                return false;
            }
        }
        return true;
    }

    public void addAddress(PersonAddress address) {
        if (address != null) {
            if (personAddresses == null) {
                personAddresses = new ArrayList<>();
            }
            personAddresses.add(address);
        }
    }

    @Override
    public String toString() {
        return "\n" + firstName + " " + secondName + personAddresses;
    }
}
