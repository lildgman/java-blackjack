package javaex.network.ex;

import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public void client() {
        int port = 4000;
        String serverIP;
        try {
            serverIP = InetAddress.getLocalHost().getHostAddress();

            Socket socket = new Socket(serverIP, port);
            System.out.println("서버와 연결됨");

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
