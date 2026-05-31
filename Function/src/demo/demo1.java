package demo;

import java.util.Arrays;
import java.util.Comparator;

public class demo1 {
    public static void main(String[] args) {
        Integer [] arr={2,4,8,1,6,3};
        //倒序排序

        //匿名内部类
        Arrays.sort(arr,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1,Integer o2){
                return o2-o1;
            }
        });
        //Lambda表达式 简化版
        Arrays.sort(arr,(o1,o2)->o2-o1);

        //方法引用 把已经存在的方法拿过来用，当作函数式接口中抽象方法的方法体
        /*
        * 引用处需要是函数式接口
        * 被引用的方法必须存在
        * 被引用的方法参数列表和返回值类型必须与函数式接口一致
        * 被引用方法的功能需要满足当前需求
        */

        //静态方法调用时一般是用类名调用
        Arrays.sort(arr,demo1::compare1);
        System.out.println(Arrays.toString( arr));
    }
    public static int compare1(Integer o1,Integer o2){
        return o2-o1;
    }
}
