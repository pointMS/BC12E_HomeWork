package hw20200910_issue20_Palindrome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Дан лист, вывести новый лист с теми строками, которые являются палиндромами,
// что бы при сравнении не учитывались пробелы и знаки пунктуации.
public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("qwer/ewq","123456", "1234-5-4321",
                "I'm not a palindrome", "А роза упала на лапу азора!", "test", "nnn..*nnn");
        System.out.println(list);

        PredicatePalindrome palindrome = new PredicatePalindrome();
        List<String> onlyPalindromes = new ArrayList<>();
        for (String element : list) {
            if (palindrome.test(element)) {
                onlyPalindromes.add(element);
            }
        }
        System.out.println(onlyPalindromes);
    }
}
