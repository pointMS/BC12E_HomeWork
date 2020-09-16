package hw20200915_MapToPrint;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("Germany", "Berlin");
        stringMap.put("Netherlands", "Amsterdam");
        stringMap.put("France", "Paris");
        stringMap.put("Spain", "Madrid");
        stringMap.put("Poland", "Warsaw");

        if(!stringMap.isEmpty()){
            for (Map.Entry<String, String> element : stringMap.entrySet()) {
                System.out.println(element.getKey() + ", " + element.getValue());
            }
        }
    }
}
