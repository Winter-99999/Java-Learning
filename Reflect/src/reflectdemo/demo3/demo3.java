package reflectdemo.demo3;

import java.lang.reflect.Field;

public class demo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Class<?> c = Class.forName("reflectdemo.demo3.Student");

        /*
        //获取公有成员变量
        Field[] fileds1 = c.getFields();
        for (Field field : fileds1) {
            System.out.println(field);
        }
        System.out.println("--------------------------------");
        //获取所有成员变量
        Field[] fileds2 = c.getDeclaredFields();
        for (Field field : fileds2) {
            System.out.println(field);
        }
        System.out.println("--------------------------------");
        //获取单个公有成员变量
        Field field1 = c.getField("sex");
        System.out.println(field1);
        System.out.println("--------------------------------");
        */

        //获取单个成员变量
        Field field2 = c.getDeclaredField("name");
        System.out.println(field2);
        System.out.println("--------------------------------");
        //获取成员变量的权限修饰符
        int mod = field2.getModifiers();
        System.out.println(mod);
        System.out.println("--------------------------------");
        //获取成员变量的数据类型
        Class<?> type = field2.getType();
        System.out.println(type);
        System.out.println("--------------------------------");
        //获取成员变量的值
        Student stu = new Student("张三", 18, "男");
        field2.setAccessible(true);
        Object value =  field2.get(stu);
        System.out.println(value);
        System.out.println("--------------------------------");
        //修改成员变量的值
        field2.set(stu, "王五");
        System.out.println(stu);
    }
}
