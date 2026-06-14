package bytestream.FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class outputdeom2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("file\\md2.txt");
        String str1 = "wawuywu";
        byte[] bytes1 = str1.getBytes();
        fos.write(bytes1);
        //换行
        //Windows \r\n  Linux \n  Mac \r
        // \r,\r写一个即可，java底层会自动补全 最好不要省略
        String str2 = "\r\n";
        byte[] bytes2 = str2.getBytes();
        fos.write(bytes2);
        String str3 = "666";
        byte[] bytes3 = str3.getBytes();
        fos.write(bytes3);
        fos.close();
    }
}
