package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class mapdemo2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 18);
        map.put("王五", 19);
        map.put("赵六", 20);
        //遍历集合
        Set<String> keys = map.keySet();
        for (String key : keys) {
            //System.out.println(key);
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("----------------");
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("----------------");
        keys.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
