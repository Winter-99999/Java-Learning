package charstream.convertstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class convertstreamdemo3 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("file\\convert\\gbkfile.txt", Charset.forName("GBK"));
        FileWriter fw = new FileWriter("file\\convert\\gbkfile_utf8file.txt",Charset.forName("UTF-8"));
        int b;
        while ((b = fr.read()) != -1) {
            fw.write(b);
        }
        fw.close();
        fr.close();
    }
}
