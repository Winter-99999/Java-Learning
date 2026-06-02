package demo.method;

import java.io.File;

public class mdemo1 {
    public static void main(String[] args) {
        //
        File f1=new File("E:\\idea\\projects\\code\\File\\file\\a");
        File f2=new File("E:\\idea\\projects\\code\\File\\file");
        File f3=new File("E:\\idea\\projects\\code\\File\\file\\a\\b");
        //public boolean isDirectory()    判断路径名表示的File是否是目录
        System.out.println(f1.isDirectory());
        System.out.println(f2.isDirectory());
        System.out.println(f3.isDirectory());
        System.out.println("--------");
        //public boolean isFile()         判断路径名表示的File是否是文件
        System.out.println(f1.isFile());
        System.out.println(f2.isFile());
        System.out.println(f3.isFile());
        System.out.println("--------");
        //public boolean exists()         判断路径名表示的File是否存在
        System.out.println(f1.exists());
        System.out.println(f2.exists());
        System.out.println(f3.exists());
    }
}
