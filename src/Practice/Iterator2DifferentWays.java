package Practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Iterator2DifferentWays {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 10);
        map.put("banana", 20);
        map.put("cherry", 30);

        // Iterating using entrySet().iterator()
        Iterator<Map.Entry<String, Integer>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        // Iterating using iterator() directly
        Iterator<Integer> iterator = map.values().iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println("Value: " + value);
        }
    }
}
