package javaex.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Run {
    public static void main(String[] args) {
        try {
            InetAddress localhost = InetAddress.getLocalHost();
            System.out.println("localhost = " + localhost);

            System.out.println("localhost.getHostName() = " + localhost.getHostName());
            System.out.println("localhost.getHostAddress() = " + localhost.getHostAddress());

            InetAddress googleHost = InetAddress.getByName("www.google.com");
            System.out.println("googleHost.getHostName() = " + googleHost.getHostName());
            System.out.println("googleHost.getHostAddress() = " + googleHost.getHostAddress());

            InetAddress[] naverHost = InetAddress.getAllByName("www.naver.com");
            System.out.println("naverHost = " + naverHost.length);

            for (InetAddress inetAddress : naverHost) {
                System.out.println("inetAddress = " + inetAddress.getHostName());
                System.out.println("inetAddress.getHostAddress() = " + inetAddress.getHostAddress());
            }


        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}
