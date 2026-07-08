package reflectdemo.demo2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class demo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class c = Class.forName("reflectdemo.demo2.Student");

        /*
        //获取所有公有构造方法
        Constructor[] cons1 = c.getConstructors();
        for (Constructor con : cons1) {
            System.out.println(con);
        }
        System.out.println("--------------------------------");
        //获取所有的构造方法
        Constructor[] cons2 = c.getDeclaredConstructors();
        for (Constructor con : cons2) {
            System.out.println(con);
        }
        System.out.println("--------------------------------");
        //获取一个公有构造方法
        Constructor con1 = c.getConstructor(int.class);
        System.out.println(con1);
        System.out.println("--------------------------------");
        */

        //获取一个构造方法
        Constructor con2 = c.getDeclaredConstructor(String.class,int.class);
        System.out.println(con2);
        System.out.println("--------------------------------");

        //获取构造方法的权限修饰符
        int mo = con2.getModifiers();
        System.out.println(mo);

        //获取构造方法参数类型
        Parameter[] parameters = con2.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }
        System.out.println("--------------------------------");

        //临时关闭反射访问权限校验以实现调用
        con2.setAccessible(true);
        Student stu = (Student) con2.newInstance("张三", 18);
        System.out.println(stu);

    }
}
