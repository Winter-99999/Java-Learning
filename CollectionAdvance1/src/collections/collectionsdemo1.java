package collections;

import java.util.ArrayList;
import java.util.Collections;

public class collectionsdemo1 {
    public static void main(String[] args) {
        //Collections 集合工具类
        ArrayList<String> list = new ArrayList<>();
        //批量添加
        Collections.addAll(list,"张三","王五","赵六","七七","张三","王五","赵六","七七");
        System.out.println(list);
        //打乱顺序
        Collections.shuffle(list);
        System.out.println(list);
        //排序
        Collections.sort(list);
        System.out.println(list);
        //反转
        Collections.reverse(list);
        System.out.println(list);
    }
}
