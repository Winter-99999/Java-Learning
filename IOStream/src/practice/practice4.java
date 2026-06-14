package practice;

import java.io.*;

public class practice4 {
    public static void main(String[] args) throws IOException {
        long start1 = System.currentTimeMillis();
        FileInputStream fis1 = new FileInputStream("file\\pr1\\p4\\p4.txt");
        FileOutputStream fos1 = new FileOutputStream("file\\pr1\\p4\\p4_1.txt");
        int b1 = 0;
        while ((b1 = fis1.read()) != -1) {
            fos1.write(b1);
        }
        fis1.close();
        fos1.close();
        long end1 = System.currentTimeMillis();
        System.out.println("普通流单个读取耗时：" + (end1 - start1));

        long start2 = System.currentTimeMillis();
        FileInputStream fis2 = new FileInputStream("file\\pr1\\p4\\p4.txt");
        FileOutputStream fos2 = new FileOutputStream("file\\pr1\\p4\\p4_2.txt");
        byte[] bytes1 = new byte[1024];
        int len1;
        while ((len1 = fis2.read(bytes1)) != -1) {
            fos2.write(bytes1, 0, len1);
        }
        fis2.close();
        fos2.close();
        long end2 = System.currentTimeMillis();
        System.out.println("普通流数组读取耗时：" + (end2 - start2));

        long start3 = System.currentTimeMillis();
        BufferedInputStream bis1 = new BufferedInputStream(new FileInputStream("file\\pr1\\p4\\p4.txt"));
        BufferedOutputStream bos1 = new BufferedOutputStream(new FileOutputStream("file\\pr1\\p4\\p4_3.txt"));
        int b2;
        while ((b2 = bis1.read()) != -1) {
            bos1.write(b2);
        }
        bis1.close();
        bos1.close();
        long end3 = System.currentTimeMillis();
        System.out.println("缓冲流单个读取耗时：" + (end3 - start3));

        BufferedInputStream bis2 = new BufferedInputStream(new FileInputStream("file\\pr1\\p4\\p4.txt"));
        BufferedOutputStream bos2 = new BufferedOutputStream(new FileOutputStream("file\\pr1\\p4\\p4_4.txt"));
        int len2;
        byte[] bytes2 = new byte[1024];
        while ((len2 = bis2.read(bytes2)) != -1) {
            bos2.write(bytes2, 0, len2);
        }
        bis2.close();
        bos2.close();
        long end4 = System.currentTimeMillis();
        System.out.println("缓冲流数组读取耗时：" + (end4 - start3));
    }
}
