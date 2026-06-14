package charstream.bufferedstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class bufferedreaderdemo {
    public static void main(String[] args) throws IOException {
        //public BufferedReader(Reader in) 创建一个使用默认大小输入缓冲区的缓冲字符输入流。
        //public String readLine() 读取一行数据。
        //readLine()方法返回一个字符串，该字符串是输入流中最后一个换行符之前的所有内容，但不会读取换行符
        BufferedReader br = new BufferedReader(new FileReader("file\\charbuffer\\cb1.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}

