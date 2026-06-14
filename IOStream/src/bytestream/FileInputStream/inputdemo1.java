package bytestream.FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class inputdemo1 {
    public static void main(String[] args) throws IOException {
        /*
         * 输出流
         * read()一次读一个字节，返回一个int类型的数据，对应的是ASCII码
         * 如果读到文件末尾，返回-1
         * 如果文件不存在，抛出FileNotFoundException异常
         * */
        FileInputStream fis = new FileInputStream("file\\d1");
        int text = fis.read();
        System.out.println((char) text);
        //释放资源
        fis.close();
    }
}
