package charstream.bufferedcopy;

import java.io.*;

public class bufferdemo1 {
    public static void main(String[] args) throws IOException {
        //字节缓冲流
        //public BufferedInputStream(InputStream in)
        //public BufferedOutputStream(OutputStream out)
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("file\\buffer\\bf1.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("file\\buffer\\copy1.txt"));
        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }
        bis.close();
        bos.close();
    }
}
