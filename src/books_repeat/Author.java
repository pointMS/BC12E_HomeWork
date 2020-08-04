package books_repeat;

/**
 * B12E_Repeat 27.06.2020
 */
public class Author {
    private String firstName;
    private String lastName;

    //конструктор делает автора из имени и фамилии
    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //метод работает также как тот, что ниже, но короче
    public Author(String fullName) {
        String[] str = fullName.trim().split(" ");
        lastName = str[str.length - 1]; //last element of array - lastName
        firstName = str[0];

    }

    //конструктор делает автора из одной строки, анализирует ее и разбивает на составляющие - firstName & lastName
//    public books_repeat.Author(String fullName) {
//        String str = " ";
//        for (int i = 0; i < fullName.length(); i++) {
//            if (fullName.charAt(i) == ' ') {//ищем с стринге пробел
//                firstName = str; //все символы, накопившиеся до пробела - первое слово
//                str = "";//обнуляем str
//            } else {
//                str += fullName.charAt(i);
//            }
//        }
//        lastName = str; //все, что накопилось после пробела - второе слово
//    }

    public String toString() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
