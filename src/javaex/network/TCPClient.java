package javaex.network;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        BufferedReader br = null;
//        PrintWriter pw = null;
//
//        Socket socket = null;
//
//        int port = 4000;
//        String serverIP = "192.168.30.21";
//
//        try {
//            socket = new Socket("localhost", port);
//            if (socket != null) {
//                System.out.println("서버와 연결 성공");
//
//                br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//                pw = new PrintWriter(socket.getOutputStream());
//
//                while (true) {
//                    System.out.println("서버에 보낼 내용: ");
//                    String sendMessage = sc.nextLine();
//                    pw.println(sendMessage);
//                    pw.flush();
//
//                    String message = br.readLine();
//                    System.out.println("서버로부터 전달받는 메시지: " + message);
//                }
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            pw.close();
//            try {
//                br.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }

        try {
            Socket socket = new Socket("localhost", 9000);
            PrintWriter pw = new PrintWriter(socket.getOutputStream());
            pw.println("Hi server!");

            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String message = br.readLine();
            System.out.println("message = " + message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
