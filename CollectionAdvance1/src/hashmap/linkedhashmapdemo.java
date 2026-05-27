package hashmap;

import java.util.LinkedHashMap;

public class linkedhashmapdemo {
    public static void main(String[] args) {
        //有序 不重复 无索引
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("张三", "上海");
        map.put("王五", "北京");
        System.out.println( map);
    }
}
