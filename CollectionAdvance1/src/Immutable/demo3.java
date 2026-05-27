package Immutable;

import java.util.Iterator;
import java.util.Map;

public class demo3 {
    public static void main(String[] args) {
        //最多传递10个键值对
        Map<String, String> map = Map.of("1", "张三", "2", "李四", "3", "王五",
                "4", "赵六", "5", "孙七", "6", "周八", "7",
                "吴九", "8", "郑十", "9", "小王", "10", "小张");
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + ":" + map.get(key));
        }
    }
}
