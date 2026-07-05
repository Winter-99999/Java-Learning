package demo.TCPdemo1;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        // 创建服务器端Socket对象 在创建对象时候需要指定端口号
        ServerSocket ss = new ServerSocket(10086);

        //监听服务器的连接
        Socket socket = ss.accept();

        // 获取输入流对象，通过输入流对象读取数据
        //这种读取方式，一次只能读取一个字节，会出现中文乱码
        InputStream is = socket.getInputStream();
        int b;
        while ((b = is.read()) != -1) {
            System.out.print((char) b);
        }

        //释放资源
        is.close();
        socket.close();
        ss.close();
    }
}
