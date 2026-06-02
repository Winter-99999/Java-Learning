package demo.method;

import java.io.File;

public class mdemo4 {
    public static void main(String[] args) {
        //public boolean delete() 删除文件或者文件夹
        //删除的文件或文件夹都不会进入回收站，而是直接删除
        //如果文件不存在 则返回false
        //如果文件路径表示的是文件夹 且文件夹为空 则返回true
        //如果文件路径表示的是文件夹 且文件夹不为空 则返回false
        File f1=new File("E:\\idea\\projects\\code\\File\\file\\a");
        boolean b1 = f1.delete();
        System.out.println(b1);
        File f2=new File("E:\\idea\\projects\\code\\File\\file\\d");
        boolean b2 = f2.delete();
        System.out.println(b2);
    }
}
