package javaex.network;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class UDPServer_Practice {

    public static void main(String[] args) {
        int port = 9500;

        try (DatagramSocket datagramSocket = new DatagramSocket(port)){
            byte[] data = new byte[50000];

            DatagramPacket dp = new DatagramPacket(data, data.length);
            System.out.println("데이터 받을 준비 완료");

            while (true) {
                datagramSocket.receive(dp);
                System.out.println("클라이언트 IP = " + dp.getAddress());
                String message = new String(dp.getData(), 0, dp.getLength());
                System.out.println("클라이언트가 보낸 내용 = " + message);
            }
        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
