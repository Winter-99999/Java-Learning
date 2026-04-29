package Clone;

import java.util.Objects;

public class c0 {
    public static void main(String[] args) throws CloneNotSupportedException {
        int data[]={1,2,3,4,5,6,7,8,9,10};
        User u1=new User("1","张三","123456","boy",data);

        User u2=(User)u1.clone();
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u1==u2);
        u1.getData()[0]=100;
        System.out.println(u1);
        System.out.println(u2);
        // equals方法  先判断对象是否为空，再判断对象是否相等
        System.out.println(u1.equals(u2));
        // 判断对象是否为空,是空的返回true
        System.out.println(Objects.isNull(u1));
        // 判断对象是否为空,不是空的返回true
        System.out.println(Objects.nonNull(u1));
    }
}
