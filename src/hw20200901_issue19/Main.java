package hw20200901_issue19;

//Дан список Person (names, List).
// У каждой персоны есть список адресов. Сформировать список персон у которых нет адреса с типом Billing

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Ringo", "Starr");
        p1.addAddress(new PersonAddress("mail123@mail.com", AddressType.EMAIL));
        p1.addAddress(new PersonAddress("Berlin", AddressType.POST));
        p1.addAddress(new PersonAddress("Dresden", AddressType.BILLING));

        Person p2 = new Person("John", "Lennon");
        p2.addAddress(new PersonAddress("mail456@mail.com", AddressType.EMAIL));
        p2.addAddress(new PersonAddress("Hamburg", AddressType.POST));

        Person p3 = new Person("George", "Harrison");
        p3.addAddress(new PersonAddress("mail789@mail.com", AddressType.EMAIL));
        p3.addAddress(new PersonAddress("Kiel", AddressType.POST));

        Person p4 = new Person("Paul", "McCartney");
        p4.addAddress(new PersonAddress("mail123@mail.com", AddressType.EMAIL));
        p4.addAddress(new PersonAddress("Berlin", AddressType.POST));
        p4.addAddress(new PersonAddress("Dresden", AddressType.BILLING));


        System.out.println("--- original list ---");
        List<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

        System.out.println(people);

        System.out.println("--- no Billing address ---");

        System.out.println(AddressListHandler.addressListHandler(people));

    }
}
