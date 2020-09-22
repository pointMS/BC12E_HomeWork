package hw20200920_ListAndMap;

import java.util.*;

public class Main {
    //Дан List<String> и Map<String, Integer>. Написать метод, добавляющий содержимое листа в Map,
    //если там есть все значения из листа, и суммирующий keys & value этих значений из Map
    //List<String> {a,b,c}
    //Map<String, Integer> {a=5, b=2, c=4, f=5}
    //result: Map<String, Integer> {a=5, b=2, c=4, f=5, abc=11}

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 5);
        map.put("b", 2);
        map.put("c", 4);
        map.put("f", 5);

        System.out.println(list);
        System.out.println(map);
        System.out.println(addListToMap(list, map));

    }

    public static Map<String, Integer> addListToMap(List<String> list, Map<String, Integer> map) {
        int sumValues = 0;
        String strKeys = "";
        for (String s : list) {
            if (map.containsKey(s)) {
                strKeys += s;
                sumValues += map.get(s);

            } else {
                return map;
            }
        }

        map.put(strKeys, sumValues);
        return map;
    }
}
