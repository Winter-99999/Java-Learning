package practice;

import java.io.File;

public class p2 {
    public static void main(String[] args) {
        boolean b = isHaveTxt("E:\\idea\\projects\\code\\File\\file");
        System.out.println(b);
    }

    //判断文件夹中是否有.txt文件 不考虑子文件夹
    public static boolean isHaveTxt(String path) {
        File f = new File(path);
        File[] files = f.listFiles();
        for (File file : files) {
            if (file.isFile() && file.getName().endsWith(".txt")) {
                return true;
            }
        }
        return false;
    }
}
