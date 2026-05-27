package Immutable;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo4 {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("1","张三");
        map.put("2","李四");
        map.put("3","王五");
        map.put("4","赵六");
        map.put("5","孙七");
        map.put("6","周八");
        map.put("7","吴九");
        map.put("8","郑十");
        map.put("9","小王");
        map.put("10","小张");
        map.put("11","大王");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        //把集合转换成数组
        /*Map.Entry[]arr1=new Map.Entry[0];
        Map.Entry[]arr2=entries.toArray(arr1);
        Map newMap=Map.ofEntries(arr2);
        */
        Map<String, String> newMap=Map.copyOf(map);
        System.out.println(newMap);
    }
}
