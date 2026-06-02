package practice;

import java.io.File;

public class p5 {
    public static void main(String[] args) {
        File f = new File("file\\d");
        int size = getSize(f);
        System.out.println(size);
    }

    //统计文件夹中所有文件的大小 单位字节
    public static int getSize(File f) {
        int len = 0;
        File[] files = f.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                len += file.length();
            } else {
                len += getSize(file);
            }
        }
        return len;
    }
}
