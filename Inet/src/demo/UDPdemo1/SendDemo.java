package demo.UDPdemo1;

import java.io.IOException;
import java.net.*;

public class SendDemo {
    public static void main(String[] args) throws SocketException, UnknownHostException {
        // 发送端不需要绑定端口  如果绑定了端口则只能用该端口发送
        DatagramSocket ds = new DatagramSocket();

        String str = "Hello World.";
        byte[] bytes = str.getBytes();
        InetAddress inetAddress = InetAddress.getLocalHost();
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, inetAddress, 10086);

        try {
            ds.send(dp);
        } catch (IOException e) {
            e.printStackTrace();
        }

        ds.close();
    }
}
