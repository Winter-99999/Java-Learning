package zipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class zipstreamdemo1 {
    public static void main(String[] args) throws IOException {
        //解压
        File src = new File("file\\zipstream1.zip");
        File dest = new File("file\\zipstream11");
        unZip(src, dest);
    }

    public static void unZip(File src, File dest) throws IOException {
        //解压的本质：读取压缩包中的文件，并按原压缩包的层级写入到指定的目录中
        ZipInputStream zis = new ZipInputStream(new FileInputStream(src));
        //获取压缩项
        ZipEntry entry;
        while ((entry = zis.getNextEntry()) != null) {
            System.out.println(entry.getName());
            if (entry.isDirectory()) {
                //文件夹处理方式
                File dir = new File(dest, entry.getName());
                dir.mkdirs();
            } else {
                //文件处理方式
                File file = new File(dest, entry.getName());
                FileOutputStream fos = new FileOutputStream(file);
                int b;
                while ((b = zis.read()) != -1) {
                    fos.write(b);
                }
                fos.close();
                zis.closeEntry();
            }
        }
    }
}
