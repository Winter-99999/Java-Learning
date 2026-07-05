package practice.practice5;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss =new ServerSocket(10086);

        while(true){
            Socket socket = ss.accept();
            new Thread(new MyRunnable(socket)).start();
        }

    }
}
