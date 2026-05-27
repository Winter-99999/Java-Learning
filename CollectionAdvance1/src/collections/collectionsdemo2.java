package collections;

import java.util.ArrayList;
import java.util.Collections;

public class collectionsdemo2 {
    public static void main(String[] args) {
        //指定元素填充集合
        //不能填充空集合
        ArrayList<Integer> list = new ArrayList<>(10);

        // 先添加占位元素，使列表大小达到容量
        for (int i = 0; i < 10; i++) {
            list.add(0);
        }

        // 现在可以正常填充
        Collections.fill(list, 1);
        System.out.println(list);
    }
}

