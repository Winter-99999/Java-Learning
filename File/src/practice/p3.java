package practice;

import java.io.File;

public class p3 {
    public static void main(String[] args) {

        File f = new File("file");
        printTxt(f);
    }

    // 判断当前目录下是否有后缀名为.txt的文件 并且打印出该文件 包括子文件夹中的.txt文件
    public static void printTxt(File f) {
        if (f != null) {
            File[] files = f.listFiles();
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(".txt")) {
                    System.out.println(file);
                } else if (file.isDirectory()) {
                    printTxt(file);
                }
            }
        }
    }

}
