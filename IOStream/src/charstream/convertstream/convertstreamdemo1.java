package charstream.convertstream;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class convertstreamdemo1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("file\\convert\\gbkfile.txt", Charset.forName("GBK"));
        int b;
        while ((b = fr.read()) != -1) {
            System.out.print((char) b);
        }
        fr.close();
    }
}
