package map;

import java.util.HashMap;
import java.util.Map;

public class mapdemo1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        //添加元素
        map.put("张三", 18);
        map.put("王五", 19);
        map.put("赵六", 20);
        System.out.println(map);   //{张三=18, 王五=19, 赵六=20}
        //如果添加的键不存在，则添加成功，返回null
        //如果添加元素的键已存在，则更新，返回被覆盖的值
        Integer i = map.put("张三", 16);
        System.out.println(i);     //18
        System.out.println(map);   //{张三=16, 王五=19, 赵六=20}
        //获取元素
        //根据键获取值
        System.out.println(map.get("张三"));   //16
        System.out.println(map.get("王五"));   //19
        //删除元素
        //根据键删除键值对 返回被删除的值
        System.out.println(map.remove("张三"));
        System.out.println(map);   //{王五=19, 赵六=20}
        //判断元素是否存在
        //两种方法 1.containsKey(key) 2.containsValue(value)
        System.out.println(map.containsKey("王五"));   //true
        System.out.println(map.containsValue(19));   //true
        //获取元素个数
        System.out.println(map.size());   //2
        //判断集合是否为空
        System.out.println(map.isEmpty());   //false
        //清空集合
        map.clear();
        System.out.println(map);   //{}
    }
}
