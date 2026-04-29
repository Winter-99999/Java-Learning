package Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Lambda3 {
    public static void main(String[] args) {
        Integer []arr={2,6,4,1,3,9,5};
        Arrays.sort(arr,(Integer o1, Integer o2)->{
            return o1-o2;
        });
        System.out.println(Arrays.toString(arr));
        //Lambda省略规则
        //可以省略参数类型
        //如果只有一个参数，可以省略括号
        //如果方法体只有一行代码，可以省略大括号和return和分号

        Arrays.sort(arr, ( o1,  o2)-> o2-o1);  //降序
        System.out.println(Arrays.toString(arr));
    }
}
