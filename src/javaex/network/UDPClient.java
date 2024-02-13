package javaex.network;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class UDPClient {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("보낼 메시지 입력: ");
        String msg = sc.nextLine();

        InetAddress inet;
        int port = 5000;

        try (DatagramSocket datagramSocket = new DatagramSocket()){
            inet = InetAddress.getByName("localhost");
            DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length, inet, port);
            datagramSocket.send(dp);
        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
