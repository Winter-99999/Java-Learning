package demo.demo1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class demo1 {
    public static void main(String[] args) throws UnknownHostException {
        // 获取本机ip
        InetAddress inetAddress = InetAddress.getLocalHost();
        // 获取本机ip地址
        String hostaddress = inetAddress.getHostAddress();
        System.out.println(hostaddress);
        // 获取本机主机名
        String hostName = inetAddress.getHostName();
        System.out.println(hostName);
        // 获取指定ip地址
        InetAddress inetAddress1 = InetAddress.getByName("192.168.1.1");
        System.out.println(inetAddress1.getHostAddress());
        System.out.println(inetAddress1.getHostName());
    }
}
