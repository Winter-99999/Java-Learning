package objectstream;

import java.io.*;

public class objectstreamdemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //反序列化流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file\\object\\object.txt"));
        Object o = ois.readObject();
        System.out.println(o);  //Student{name='王', age=20, id=0}
        ois.close();
    }
}
