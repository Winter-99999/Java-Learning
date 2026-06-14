package commonsio;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class commonsiodemo {
    public static void main(String[] args) throws IOException {
        /*FileUtils类
        static void copyFile(File srcFile, File destFile) 复制文件
        static void copyDirectory(File src, File dest) 复制文件夹
        static void copyToDirectory(File src, File dest) 复制文件到文件夹
        static void moveFile(File srcFile, File destFile) 移动文件
        static void moveDirectory(File src, File dest) 移动文件夹
        static void deleteQuietly(File file) 删除文件
        static void deleteDirectoryQuietly(File directory) 删除文件夹
        static void clearDirectory(File directory) 删除文件夹下的所有文件 清空文件夹
        */
        /*IOUtils类
        static void copy(InputStream input, OutputStream output) 拷贝流
        static void closeQuietly(Closeable closeable) 静默关闭流
         */
        File src = new File("file\\commonsio\\srcfile1");
        File dest = new File("file\\commonsio\\destfile1");
        FileUtils.copyFile(src, dest);
    }
}
