package zipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class zipstreamdemo3 {
    public static void main(String[] args) throws IOException {
        //压缩文件夹
        //源文件夹
        File src = new File("file\\zipstream\\directoryzip");
        //目标文件夹父级路径
        File destParent = new File(src.getParent());
        //目标文件夹
        File dest = new File(destParent, src.getName() + ".zip");
        //创建压缩流
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));

        directoryZip(src, zos, src.getName());
        zos.close();
    }

    public static void directoryZip(File src, ZipOutputStream zos, String name) throws IOException {
        //进入源文件夹
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                directoryZip(file, zos, name + "\\" + file.getName());
            } else {
                zos.putNextEntry(new ZipEntry(name + "\\" + file.getName()));
                FileInputStream fis = new FileInputStream(file);
                byte[] b = new byte[1024];
                int len;
                while ((len = fis.read(b)) != -1) {
                    zos.write(b, 0, len);
                }
                fis.close();
                zos.closeEntry();
            }
        }
    }
}
