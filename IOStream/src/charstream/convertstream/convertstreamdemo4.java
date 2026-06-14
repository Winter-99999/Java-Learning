package charstream.convertstream;

import java.io.*;

public class convertstreamdemo4 {
    public static void main(String[] args) throws IOException {
        //利用字节流读取文件，一次读一整行，且不能出现乱码
        FileInputStream fis = new FileInputStream("file\\convert\\gbkfile_utf8file.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
        isr.close();
        fis.close();
        //BufferedReader br2=new BufferedReader
        //(new InputStreamReader(new FileInputStream("file\\convert\\gbkfile_utf8file.txt")));
    }
}
