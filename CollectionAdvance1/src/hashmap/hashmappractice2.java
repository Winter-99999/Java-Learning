package hashmap;

import java.util.*;
import java.util.function.Consumer;

public class hashmappractice2 {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D"};
        ArrayList<String> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 80; i++) {
            int index = random.nextInt(arr.length);
            list.add(arr[index]);
        }
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : list) {
            if (map.containsKey(s)) {
                int count = map.get(s);
                map.put(s, count + 1);
            } else {
                map.put(s, 1);
            }
        }
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }
        System.out.println("----------------");
        int max = 0;
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() > max) max = entry.getValue();
        }
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() == max) {
                System.out.println(entry.getKey() + "--" + entry.getValue());
            }
        }
    }
}
