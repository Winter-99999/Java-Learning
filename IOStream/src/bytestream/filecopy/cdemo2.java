package bytestream.filecopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class cdemo2 {
    public static void main(String[] args) throws IOException {
        //一次读取多个数据
        //一次性读取的数据多少取决于byte数组的长度
        //返回值是实际读取的字节数
        //如果文件末尾没有字节，返回-1
        long start = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("file\\copytest.txt");
        FileOutputStream fos = new FileOutputStream("file\\c2.txt");
        int len = 0;
        byte[] bytes = new byte[2];  //一般是1024的倍数
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        fos.close();
        fis.close();

        long end = System.currentTimeMillis();
        System.out.println("复制完成，耗时：" + (end - start) + "毫秒");
    }
}
