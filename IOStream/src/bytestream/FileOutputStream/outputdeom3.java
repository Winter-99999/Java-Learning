package bytestream.FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class outputdeom3 {
    public static void main(String[] args) throws IOException {
        //续写
        //需要在构造方法中添加一个参数true

        FileOutputStream fos = new FileOutputStream("file\\md3.txt", true);
        fos.write(97);
        fos.close();
    }
}
