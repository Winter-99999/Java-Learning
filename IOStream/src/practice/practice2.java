package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class practice2 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("file\\pr1\\p2.txt");
        File f2 = new File("file\\pr1\\p2ency.txt");
        FileInputStream fis = new FileInputStream(f1);
        FileOutputStream fos = new FileOutputStream(f2);
        //加密
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b ^ 5);
        }
        fis.close();
        fos.close();
        //解密只需将路径调换
    }
}
