package bytestream.PrintStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class printstreamdemo1 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        //打印流不操作数据源，只操作目的地
        //public PrintStream(OutputStream out/File/String)
        //public PrintStream(OutputStream out, boolean autoFlush, String charsetName) 创建一个具有指定字符集的打印流，同时指定是否自动刷新
        //字节流底层没有缓冲区 默认自动刷新
        PrintStream ps = new PrintStream(new FileOutputStream("file\\print\\p1.txt"), true, "UTF-8");
        ps.println("hello world");
        ps.println(97);
        ps.print("hello world");
        ps.printf("%d",100);
        ps.close();
    }
}
