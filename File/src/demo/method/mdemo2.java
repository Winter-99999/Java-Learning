package demo.method;

import java.io.File;

public class mdemo2 {
    public static void main(String[] args) {
        File f1=new File("E:\\idea\\projects\\code\\File\\file\\a");
        File f2=new File("E:\\idea\\projects\\code\\File\\file");
        //public int length() 获取文件的大小 单位为字节
        //只能获取文件的大小 文件夹大小无法获取
        System.out.println(f1.length());
        System.out.println(f2.length());
        System.out.println("--------");
        //public String getAbsolutePath() 获取绝对路径
        File f3=new File("file\\a");
        System.out.println(f1.getAbsolutePath());
        System.out.println(f3.getAbsolutePath());
        System.out.println("--------");
        //public String getPath() 获取定义文件时所用的路径
        File f4=new File("a");
        System.out.println(f1.getPath());
        System.out.println(f4.getPath());
        System.out.println("--------");
        //public String getName() 获取文件名
        //如果是文件 则返回带后缀的文件名
        //如果是文件夹 则返回文件夹名
        System.out.println(f1.getName());
        System.out.println(f2.getName());
        System.out.println("---------");
        //public long lastModified() 获取最后一次修改时间 单位是毫秒
        System.out.println(f1.lastModified()/1000/60);
    }
}
