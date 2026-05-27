package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class practice1 {
    public static void main(String[] args) {
        //随机点名器
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"小王","小张","小李","小赵","小钱");

        Random r=new Random();
        int index=r.nextInt(list.size());
        System.out.println(list.get(index));

        Collections.shuffle(list);
        System.out.println(list.get(0));
    }
}
