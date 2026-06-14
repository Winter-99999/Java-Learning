package bytestream.filecopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class cdemo1 {
    public static void main(String[] args) throws IOException {
        //文件拷贝
        FileInputStream fis = new FileInputStream("file\\copytest.txt");
        FileOutputStream fos = new FileOutputStream("file\\c1.txt");
        int b;
        while((b = fis.read()) !=-1){
            fos.write(b);
        }
        //先占用的后释放
        fos.close();
        fis.close();
    }
}
