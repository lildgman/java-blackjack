package javaex.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        BufferedReader br = null;
//        PrintWriter pw = null;
//
//        int port = 4000;
//
//        ServerSocket ss;
//
//        try {
//            ss = new ServerSocket(port);
//            System.out.println("클라이언트 요청 대기중");
//
//            Socket socket = ss.accept();
//            System.out.println(socket.getInetAddress().getHostAddress() + "가 연결 요청");
//
//            // 클라이언트로부터 전달된 값을 읽기위한 스트림
//            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//            // 클라이언트에게 값을 한줄단위로 출력할 수 있는 스트림
//            pw = new PrintWriter(socket.getOutputStream());
//
//            while (true) {
//                String message = br.readLine();
//                System.out.println("클라이언트로부터 전달받은 메시지: " + message);
//
//                System.out.println("클라언트에게 보낼 내용: ");
//                String sendMessage = sc.nextLine();
//
//                pw.println(sendMessage);
//                pw.flush();
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            try {
//                pw.close();
//                br.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }


        try {
            ServerSocket ss = new ServerSocket(9000);
            System.out.println("클라이언트 대기중");

            Socket socket = ss.accept();
            System.out.println("클라이언트 연결");

            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String clientMessage = br.readLine();
            System.out.println("clientMessage = " + clientMessage);

            PrintWriter pw = new PrintWriter(socket.getOutputStream());
            pw.println("Hi Client");

            socket.close();
            ss.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
