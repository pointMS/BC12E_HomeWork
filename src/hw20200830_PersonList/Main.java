package hw20200830_PersonList;
/*Given a List. Every Person has a list of Address of various type (ex. Delivery address, e-mail, billing address…).
Write the program that create and displays the list of String [e-mail name]
*/

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Address> addressList = new ArrayList<>();

        Address address1 = new Address("Berlin, StreetOne 15",
                "post15@gmx.de", "157.128.567");
        Address address2 = new Address("Berlin, StreetTwo 18",
                "post18@gmail.com", "456.79.658");
        Address address3 = new Address("Berlin, StreetThree 22",
                "post22@gmx.de", "112.934.995");
        Address address4 = new Address("mail65@gmail.com");

        addressList.add(address1);
        addressList.add(address2);
        addressList.add(address3);

        Person p1 = new Person("John", address1);
        Person p2 = new Person("Nick", address2);
        Person p3 = new Person("Jim", address3);
        Person p4 = new Person("Tom", address4);

        List<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        for (Person p : people) {
            System.out.println(p);
        }
    }
}
