package demo.TCPdemo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        // 创建服务器端Socket对象 在创建对象时候需要指定端口号
        ServerSocket ss = new ServerSocket(10000);

        //监听服务器的连接
        Socket socket = ss.accept();

        // 获取输入流对象，通过输入流对象读取数据
        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is); //解决中文乱码问题
        BufferedReader br = new BufferedReader(isr);
        int b;
        while ((b = br.read()) != -1) {
            System.out.print((char) b);
        }

        //释放资源
        is.close();
        socket.close();
        ss.close();
    }
}
