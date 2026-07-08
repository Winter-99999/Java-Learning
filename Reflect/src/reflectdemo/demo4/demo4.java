package reflectdemo.demo4;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class demo4 {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<Student> c = Student.class;

        //获取公有成员方法(包括从父类继承来的)
        /*Method[] ms1 = c.getMethods();
        for (Method m : ms1) {
            System.out.println(m);
        }
        System.out.println("--------------------------------");*/

        //获取所有成员方法(不包括从父类继承来的)
        /*Method[] ms2 = c.getDeclaredMethods();
        for (Method m : ms2) {
            System.out.println(m);
        }
        System.out.println("--------------------------------");*/

        //获取单个成员方法 形参包括方法名和参数类型 如果方法没有形参则不用写参数类型
        /*Method m1 = c.getMethod("show", String.class, int.class);
        System.out.println(m1);
        System.out.println("--------------------------------");*/

        //获取单个成员方法
        /*Method m2 = c.getDeclaredMethod("eat");
        System.out.println(m2);*/

        //获取成员方法的权限修饰符
        Method m3 = c.getDeclaredMethod("show", String.class, int.class);
        /*int mod = m3.getModifiers();
        System.out.println(mod);*/

        //获取成员方法的形参
        Parameter[] parameters = m3.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }

        //获取方法的名字
        String name = m3.getName();
        System.out.println(name);


    }
}
