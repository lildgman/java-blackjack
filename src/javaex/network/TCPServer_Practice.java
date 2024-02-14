package javaex.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = null;
        PrintWriter pw = null;
        try {
            ServerSocket ss = new ServerSocket(9000);
            System.out.println("클라이언트 요청 대기");

            Socket socket = ss.accept();
            System.out.println(socket.getInetAddress().getHostAddress() + "가 연결 요청");

            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            pw = new PrintWriter(socket.getOutputStream());

            while (true) {
                String message = br.readLine();
                System.out.println("클라이언트로부터 전달받은 메시지 = " + message);

                System.out.print("클라이언트에게 보낼 내용 = ");
                String sendMessage = sc.nextLine();

                pw.println(sendMessage);
                pw.flush();

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                pw.close();
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
