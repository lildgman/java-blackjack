package javaex.network;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class UDPClient_Practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("보낼 메세지: ");
        String message = sc.nextLine();

        InetAddress inetAddress;
        int port = 9500;

        try (DatagramSocket datagramSocket = new DatagramSocket()){
            inetAddress = InetAddress.getByName("localhost");
            DatagramPacket dp = new DatagramPacket(message.getBytes(), message.getBytes().length, inetAddress, port);
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
