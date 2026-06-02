package practice;

import java.io.File;
import java.io.IOException;

public class p1 {
    public static void main(String[] args) throws IOException {
        File f = new File("file\\aaa");
        f.mkdir();
        File f1 = new File(f, "p1.txt");
        boolean newFile = f1.createNewFile();
        if (newFile) {
            System.out.println("创建成功");
        } else {
            System.out.println("创建失败");
        }

    }
}
