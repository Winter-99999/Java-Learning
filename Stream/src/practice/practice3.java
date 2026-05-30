package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class practice3 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list1, "刘备，23", "诸葛亮，24", "关羽，25", "司马懿，26", "夏侯惇，23");
        Collections.addAll(list2, "貂蝉，21", "杨冰，25", "甄姬，22", "杨过，20");
        //只要名字长度为3的前两个人
        Stream<String> newList1 = list1.stream()
                .filter(s -> s.split("，")[0].length() == 3)
                .limit(2);
        //只要姓杨的且不要第一个人
        Stream<String> newList2 = list2.stream()
                .filter(s -> s.charAt(0) == '杨')  // s.split("，")[0].startsWith("杨")
                .skip(1);
        //合并
        Stream<Actor> newList = Stream.concat(newList1, newList2).map(new Function<String, Actor>() {
            @Override
            public Actor apply(String s) {
                return new Actor(s.split("，")[0], Integer.parseInt(s.split("，")[1]));
            }
        });
        newList.forEach(actor -> System.out.println(actor.getName() + "---" + actor.getAge()));
    }
}
