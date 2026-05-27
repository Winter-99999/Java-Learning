package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class mapdemo3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 18);
        map.put("王五", 19);
        map.put("赵六", 20);
        //遍历集合 entrySet
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        System.out.println("----------------");
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value); 
        }
        System.out.println("----------------");
        entries.forEach(new Consumer<Map.Entry<String, Integer>>() {
            @Override
            public void accept(Map.Entry<String, Integer> stringIntegerEntry) {
                String key = stringIntegerEntry.getKey();
                Integer value = stringIntegerEntry.getValue();
                System.out.println(key + "=" + value);
            }
        });
        System.out.println("----------------");
        map.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String key, Integer value) {
                System.out.println(key + "=" + value);
            }
        });
        //map.forEach(( key,  value)-> System.out.println(key + "=" + value));
    }
}
