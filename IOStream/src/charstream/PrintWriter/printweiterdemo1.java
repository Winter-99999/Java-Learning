package charstream.PrintWriter;

import java.io.*;

public class printweiterdemo1 {
    public static void main(String[] args) throws IOException {
        //public PrintWriter(Writer/File/String)
        //public PrintWriter(Writer,boolean autoFlush, String charsetName)
        PrintWriter pw = new PrintWriter(new FileWriter("file\\print\\p2.txt"), true);
        pw.println("hello world");
        pw.close();
    }
}
