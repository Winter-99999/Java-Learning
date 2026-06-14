package charstream.bufferedcopy;

import java.io.*;

public class bufferdemo2 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("file\\buffer\\bf2.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("file\\buffer\\copy2.txt"));
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bis.close();
        bos.close();
    }
}
