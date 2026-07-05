package demo.UDPdemo2;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class SendMessage {
    public static void main(String[] args) throws SocketException, UnknownHostException {
        DatagramSocket ds = new DatagramSocket();
        boolean flag = true;
        while (flag) {
            System.out.println("请输入想要发送的信息");
            Scanner sc = new Scanner(System.in);
            String str=sc.nextLine();
            if ("886".equals(str)) {
                flag=false;
            }
            byte[] bytes = str.getBytes();
            InetAddress address = InetAddress.getByName("127.0.0.1");
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, 10086);
            try {
                ds.send(dp);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        ds.close();
    }
}
