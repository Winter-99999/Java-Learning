package charstream.FIleReader;

import java.io.FileReader;
import java.io.IOException;

public class filereaderdemo2 {
    public static void main(String[] args) throws IOException {
        //有参read()
        //读取数据+解码+强转字符类型
        //public int read(char[] cbuf)
        FileReader fr = new FileReader("file\\fr1");
        int len = 0;
        char[] chars = new char[2];
        while ((len = fr.read(chars)) != -1) {
            System.out.print(new String(chars, 0, len));
        }
        fr.close();
    }
}
