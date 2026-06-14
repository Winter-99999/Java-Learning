package charstream.convertstream;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class convertstreamdemo2 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("file\\convert\\utf8file.txt", Charset.forName("UTF-8"));
        fw.write("hello world");
        fw.close();
    }
}
