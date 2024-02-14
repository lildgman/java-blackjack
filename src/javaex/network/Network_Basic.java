package javaex.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Network_Basic {
    public static void main(String[] args) {

        try {
            InetAddress localhost = InetAddress.getLocalHost();
            System.out.println("localhost = " + localhost);

            System.out.println("localhost.getHostName() = " + localhost.getHostName());
            System.out.println("localhost.getHostAddress() = " + localhost.getHostAddress());

            InetAddress naverHost = InetAddress.getByName("www.naver.com");
            System.out.println("naverHost.getHostName() = " + naverHost.getHostName());
            System.out.println("naverHost.getHostAddress() = " + naverHost.getHostAddress());

            InetAddress[] googleHost = InetAddress.getAllByName("www.google.com");
            System.out.println("googleHost.length = " + googleHost.length);

            for (InetAddress i : googleHost) {
                System.out.println("i.getHostName() = " + i.getHostName());
                System.out.println("i.getHostAddress() = " + i.getHostAddress());
            }
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}
