package practice;

import java.io.*;

public class practice1 {
    public static void main(String[] args) throws IOException {
        File src = new File("file");
        File dest = new File("file1");
        copy(src, dest);
    }

    public static void copy(File src, File dest) throws IOException {
        dest.mkdirs();
        File[] files = src.listFiles();
        if (files == null) {
            return;
        }
        for (File f : files) {
            if (f.isFile()) {
                FileInputStream fis = new FileInputStream(f);
                FileOutputStream fos = new FileOutputStream(new File(dest, f.getName()));
                byte[] bytes = new byte[1024];
                int len = 0;
                while ((len = fis.read(bytes)) != -1) {
                    fos.write(bytes, 0, len);
                }
                fos.close();
                fis.close();
            } else {
                copy(f, new File(dest, f.getName()));
            }
        }
    }
}
