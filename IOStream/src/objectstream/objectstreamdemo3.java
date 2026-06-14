package objectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class objectstreamdemo3 {
    public static void main(String[] args) throws IOException {
        //不确定序列化对象的个数，用集合存储对象
        Student s1=new Student("王",20,1);
        Student s2=new Student("张",23,2);
        Student s3=new Student("白",25,3);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file\\object\\object1.txt"));
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        oos.writeObject(list);
        oos.close();
    }
}
