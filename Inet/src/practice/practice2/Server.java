package practice.practice2;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);
        System.out.println("等待连接...");
        Socket s = ss.accept();
        System.out.println("连接成功");

        InputStream is = s.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        int b;
        StringBuilder sb = new StringBuilder();
        while ((b = isr.read()) != -1) {
            System.out.print((char) b);
        }

        OutputStream os = s.getOutputStream();
        os.write("Hello,Client".getBytes());

        os.close();
        is.close();
        isr.close();
        s.close();
        ss.close();
    }
}
