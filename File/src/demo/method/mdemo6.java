package demo.method;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class mdemo6 {
    public static void main(String[] args) {
        File f1=new File("E:\\idea\\projects\\code\\File\\file");
        //public File[] listFiles() 获取当前目录下的所有文件或者文件夹
        //获取所有.txt文件
        File[] files = f1.listFiles();
        for (File file : files) {
            if (file.isFile() && file.getName().endsWith(".txt")) {
                System.out.println(file);
            }
        }

        /*
        File[] files = f1.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile() && pathname.getName().endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(files));
        */
    }
}
