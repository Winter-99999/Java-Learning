package practice.reflectpractice1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class test1 {
    public static void main(String[] args) throws IllegalAccessException, IOException {
        Student s1 = new Student("张三", 18, "男", 1.80, "football");
        Teacher t1 = new Teacher("王五",8000);
//        saveMessage(s1);
        saveMessage(t1);
    }

    private static void saveMessage(Object obj) throws IllegalAccessException, IOException {
        //获取对象类
        Class c = obj.getClass();
        //获取对象类属性
        Field[] fields = c.getDeclaredFields();
        //Io流输出
        BufferedWriter bw =new BufferedWriter(new FileWriter("src/practice/practice1/message.txt"));

        for (Field field : fields) {
            field.setAccessible(true);
            //获取属性名
            String name = field.getName();
            //获取属性值
            Object o = field.get(obj);
            bw.write(name+"--"+o);
            bw.newLine();
        }
        bw.close();
    }
}
