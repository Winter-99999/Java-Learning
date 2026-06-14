package charstream.FIleWriter;

import java.io.FileWriter;
import java.io.IOException;

public class filewriterdemo1 {
    public static void main(String[] args) throws IOException {
        //public void write(int c)：写入单个字符。
        //public void write(char[] cbuf)：写入字符数组。
        //public void write(char[] cbuf, int off, int len)：写入字符数组的子字符。
        //public void write(String str)：写入字符串。
        //public void write(String str, int off, int len)：写入字符串的子字符。
        FileWriter fw = new FileWriter("file\\fw1");
        fw.write(97);
        fw.write("\r\n");
        char[] chars = {'a', 'b', 'c'};
        fw.write(chars);
        fw.write("\r\n");
        fw.write(chars, 1, 2);
        fw.write("\r\n");
        fw.write("hello");
        fw.write("\r\n");
        fw.write("hello", 1, 2);
        fw.close();
    }
}
