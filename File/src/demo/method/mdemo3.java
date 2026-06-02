package demo.method;

import java.io.File;
import java.io.IOException;

public class mdemo3 {
    public static void main(String[] args) throws IOException {
        //public boolean createNewFile() 创建文件
        //如果文件已存在 则返回false，否则创建文件并返回true
        //创建文件时，如果创建的文件所在的目录不存在 则会抛出IOException
        //该方法只能创建文件
        File f1=new File("E:\\idea\\projects\\code\\File\\file\\b.txt");
        boolean a=f1.createNewFile();
        System.out.println(a);
        //public boolean mkdir() 创建单级文件夹
        //注意命名细节
        //如果文件夹已存在 则返回false，否则创建文件夹并返回true
        File f2=new File("E:\\idea\\projects\\code\\File\\file\\c");
        boolean b=f2.mkdir();
        System.out.println(b);
        //public boolean mkdirs() 创建多级文件夹
        //既可以创建单级文件夹也可以创建多级文件夹
        File f3=new File("E:\\idea\\projects\\code\\File\\file\\d\\e");
        boolean c=f3.mkdirs();
        System.out.println(c);
    }
}
