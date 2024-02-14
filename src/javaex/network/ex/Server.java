package javaex.network.ex;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public void server() {
        int port = 4000;
        ServerSocket server;

        try {
            server = new ServerSocket(port);

            System.out.println("소켓 생성");

            while(true) {
                Socket client = server.accept();

                System.out.println(client.getInetAddress().getHostAddress()+"연결됨");

                client.close();

            }

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
