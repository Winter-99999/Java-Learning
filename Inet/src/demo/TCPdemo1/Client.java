package demo.TCPdemo1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        // 创建socket对象 在创建对象的时候需要指定服务端的ip地址和端口号 会连接服务器
        Socket socket = new Socket("127.0.0.1", 10086);

        OutputStream os = socket.getOutputStream();
        os.write("hello world".getBytes());

        os.close();
        socket.close();

    }
}
