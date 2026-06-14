package demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws IOException {
        //参数是String类型表示的文件路径或者是File类型均可
        //如果文件不存在则会创建一个文件，但父级路径必须存在
        FileOutputStream fos = new FileOutputStream("file\\d1");
        //write方法的形参是int类型，实际写入的是ASCII码对应的字符
        //覆盖形式写入
        fos.write(97);
        //完成操作后释放资源
        fos.close();
    }
}
