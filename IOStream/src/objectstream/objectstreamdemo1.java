package objectstream;

import java.io.*;

public class objectstreamdemo1 {
    public static void main(String[] args) throws IOException {
        //序列化流
        //写入的数据不能被更改，一旦修改就读不出来了
        Student s=new Student("王",20,1);
        //必须实现Serializable接口，该接口没有抽象方法，是标记接口，标记该类的对象可序列化
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("file\\object\\object.txt"));
        oos.writeObject(s);
        oos.close();
    }
}