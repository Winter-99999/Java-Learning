package practice.practice1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",10000);
        Scanner sc = new Scanner(System.in);
        OutputStream os = socket.getOutputStream();
        while (true) {
            System.out.println("请输入想要发送的信息");
            String str = sc.next();
            if ("886".equals(str)) {
                break;
            }
            os.write(str.getBytes());
        }
        os.close();
        socket.close();
    }
}
