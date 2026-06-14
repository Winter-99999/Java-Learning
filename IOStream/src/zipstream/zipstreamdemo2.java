package zipstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class zipstreamdemo2 {
    public static void main(String[] args) throws IOException {
        //压缩文件
        File src = new File("file\\zipstream\\filezip");
        File dest = new File("file\\zipstream\\");
        fileZip(src, dest);
    }

    public static void fileZip(File src, File dest) throws IOException {
        //创建压缩流
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest, src.getName() + ".zip")));
        //创建压缩项
        ZipEntry entry = new ZipEntry(src.getName());
        //添加压缩项
        zos.putNextEntry(entry);
        byte b[] = new byte[1024];
        int len;
        FileInputStream fis = new FileInputStream(src);
        while ((len = fis.read(b)) != -1) {
            zos.write(b, 0, len);
        }
        fis.close();
        zos.closeEntry();
        zos.close();
    }
}
