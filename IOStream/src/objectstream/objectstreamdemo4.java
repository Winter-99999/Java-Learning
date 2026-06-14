package objectstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class objectstreamdemo4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file\\object\\object1.txt"));
        ArrayList<Student> list = (ArrayList<Student>)ois.readObject();
        for (Student s : list) {
            System.out.println(s);
        }
        ois.close();
    }
}
