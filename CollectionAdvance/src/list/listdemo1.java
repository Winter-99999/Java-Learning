package list;
import java.util.ArrayList;
import java.util.List;

public class listdemo1 {
    public static void main(String[] args) {
        //list是一个接口
        List<Integer> list=new ArrayList<>();
        //添加元素
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(0,4);
        System.out.println(list);     //[4, 1, 2, 3]

        //删除元素  返回删除的元素
        //优先调用形参和实参相同的方法
        Integer removedElement = list.remove(1);   //删除索引为1的元素
        System.out.println(removedElement);   //1
        //手动装箱
        Integer i=3;
        boolean b = list.remove(i);   //删除元素i
        System.out.println(b);   //true
        System.out.println(list);        //[4, 2]

        //修改指定位置的元素 返回修改前的元素
        Integer previousElement = list.set(0,5);
        System.out.println(previousElement);  //4
        System.out.println(list);    //[5, 2]

        //获取指定位置的元素
        System.out.println(list.get(0));  //5
    }
}
