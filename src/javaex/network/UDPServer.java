package javaex.network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {
    public static void main(String[] args) {

        int port = 5000;

        try(DatagramSocket datagramSocket = new DatagramSocket(port)) {

            byte[] data = new byte[60000];

            DatagramPacket dp = new DatagramPacket(data, data.length);
            System.out.println("데이터 받을 준비 완료");

            while (true) {
                datagramSocket.receive(dp);
                System.out.println("클라이언트 IP = " + dp.getAddress());
                String message = new String(dp.getData(), "UTF-8");
                System.out.println("클라이언트가 보낸 내용 = " + message);
            }
        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
