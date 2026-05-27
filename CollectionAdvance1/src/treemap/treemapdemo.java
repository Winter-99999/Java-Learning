package treemap;

import java.util.Comparator;
import java.util.TreeMap;

public class treemapdemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> tmap=new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
//                return o1-o2;   //升序
                return o2-o1;     //降序
            }
        });
        tmap.put(1,"张三");
        tmap.put(4,"七七");
        tmap.put(3,"王五");
        tmap.put(2,"赵六");
        System.out.println(tmap);
    }
}
