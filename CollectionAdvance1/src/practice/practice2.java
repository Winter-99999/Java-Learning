package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class practice2 {
    public static void main(String[] args) {
        //30%概率抽到男生
        //70%概率抽到女生
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "男1", "男2", "男3", "男4", "男5", "女1", "女2", "女3", "女4", "女5");
        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1);
        Collections.shuffle(list1);
        int index = list1.get(0);
        if (index == 0) {
            Random r = new Random();
            int index1 = r.nextInt(5);
            System.out.println(list.get(index1));
        } else {
            Random r = new Random();
            int index1 = r.nextInt(5) + 5;
            System.out.println(list.get(index1));
        }
    }
}
