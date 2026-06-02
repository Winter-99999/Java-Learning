package demo.method;

import java.io.File;

public class mdemo5 {
    public static void main(String[] args) {
        //public File[] listFiles() 获取当前目录下的所有文件或者文件夹
        /*
        * 如果当前路径表示的文件夹不存在 则返回null
        * 如果当前路径表示的是文件 则返回null
        * 如果当前路径表示的是文件夹 且文件夹为空 则返回一个长度为0的数组
        * 如果当前路径表示的是文件夹 则返回文件夹中的所有文件和文件夹，包括隐藏文件
        * 如果当前路径表示的文件夹需要权限才能访问 则返回null
        * 只能获取当前目录下的文件和文件夹
        * */
        File f1=new File("E:\\idea\\projects\\code\\File\\file\\d");
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
