package practice;

import java.io.File;

public class p4 {
    public static void main(String[] args) {
        File f = new File("file\\bbb");
        delete(f);
    }

    //删除多级文件夹
    public static void delete(File f) {
        File[] files = f.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                file.delete();
            } else {
                delete(file);
            }
        }
        f.delete();
    }
}
