package demo.UDPdemo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveMessage {
    public static void main(String[] args) throws SocketException {
        DatagramSocket ds = new DatagramSocket(10086);
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        while (true) {
            try {
                ds.receive(dp);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            byte[] result = dp.getData();
            int len = dp.getLength();
            String str = new String(result, 0, len);
            System.out.println(str);
        }
    }
}
