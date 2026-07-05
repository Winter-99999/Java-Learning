package demo.UDPdemo1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveDemo {
    public static void main(String[] args) throws SocketException {
        //先运行接收端，再运行发送端
        //接收端必须绑定端口 与发送端DatagramPacket绑定的端口一致
        DatagramSocket ds = new DatagramSocket(10086);

        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        try {
            ds.receive(dp);
        } catch (IOException e) {
            e.printStackTrace();
        }

        byte []result= dp.getData();
        int len = dp.getLength();
        String str = new String(result, 0,len);
        System.out.println("接收到数据 "+ str);
        System.out.println("来自 "+ dp.getAddress() + " 端口是 " + dp.getPort());
        ds.close();
    }
}
