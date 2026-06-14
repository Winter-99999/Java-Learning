package bytestream.FileOutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class outputdeom1 {
    public static void main(String[] args) throws IOException {
        File f = new File("file\\md1.txt");
        FileOutputStream fos = new FileOutputStream(f);
        //public void write(int b)
        fos.write(97);
        //public void write(byte[] b)
        byte[] bytes = {97, 98, 99, 100};
        fos.write(bytes);
        //public void write(byte[] b,int off,int len)
        byte[] bytes2 = {97, 98, 99};
        fos.write(bytes2, 1, 2);
        fos.close();
    }
}
