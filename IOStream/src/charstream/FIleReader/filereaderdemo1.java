package charstream.FIleReader;

import java.io.FileReader;
import java.io.IOException;

public class filereaderdemo1 {
    public static void main(String[] args) throws IOException {
        FileReader fr= new FileReader("file\\fr1");
        //read() 读取数据
        //字符流底层是字节流，默认是一个字节一个字节读取的
        //英文一次读一个字节，中文按编码方式进行读取
        //把二进制转换为十进制进行返回，原本内容只需将这个十进制转换为字符类型即可
        int ch;
        while((ch=fr.read())!=-1){
            System.out.print((char)ch);
        }
        fr.close();
    }
}
