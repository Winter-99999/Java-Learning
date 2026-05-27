package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class practice3 {
    public static void main(String[] args) {
        //随机点名，点到的不会再被点到，都点完后重新开始
        String[] names = {"小王", "小张", "小李", "小赵", "小钱"};
        ArrayList<String> list1 = new ArrayList<>(names.length);
        Collections.addAll(list1, names);
        ArrayList<String> list2 = new ArrayList<>();
        int count = 2;
        for(int i = 0; i < count; i++) {
            System.out.println("第" + (i + 1) + "轮:");
            while(list1.size() > 0){
            extracted(list1, list2);
            }
            if (list1.size() == 0) {
                list1.addAll(list2);
                list2.clear();
                System.out.println();
            }
        }
    }

    private static void extracted(ArrayList<String> list1, ArrayList<String> list2) {
        Random r = new Random();
        int index = r.nextInt(list1.size());
        String name = list1.remove(index);
        list2.add(name);
        System.out.println(name);
    }
}
