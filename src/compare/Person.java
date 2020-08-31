package compare;

public class Person implements Comparable<Person> {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "age: " + age + " name: " + name + " / ";
    }

    //by age and name
    @Override
    public int compareTo(Person person) {
        if (this.age == person.age) {
            return this.name.compareTo(person.name);
        } else
            return this.age - person.age;
    }


//    //by name and age
//    @Override
//    public int compareTo(Person person) {
//        if (this.name.compareTo(person.name) == 0) {
//            return this.age - person.age ;
//        }else
//        return this.name.compareTo(person.name);
//    }

//    //by name
//    @Override
//    public int compareTo(Person person) {
//        return this.name.compareTo(person.name);
//    }

//    //by age
//    @Override
//    public int compareTo(Person person) {
//        return this.age - person.age;
//    }
}
