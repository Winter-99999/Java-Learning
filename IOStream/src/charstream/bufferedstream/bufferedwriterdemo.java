package charstream.bufferedstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class bufferedwriterdemo {
    public static void main(String[] args) throws IOException {
        //public BufferedWriter(Writer out) 创建一个具有默认大小输出缓冲区的缓冲字符输出流。
        //public void newLine() 刷新该流并写入一个行分隔符。
        BufferedWriter bw = new BufferedWriter(new FileWriter("file\\charbuffer\\cb2.txt"));
        bw.write("hello world");
        bw.newLine();
        bw.write("hello world");
        bw.close();
    }
}
