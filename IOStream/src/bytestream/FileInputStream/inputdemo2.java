package bytestream.FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class inputdemo2 {
    public static void main(String[] args) throws IOException {
        //循环读取
        FileInputStream fis = new FileInputStream("file\\d1");
        int b;
        while ((b=fis.read())!=-1) {
            System.out.print((char) b);
        }
        fis.close();
    }
}
