package javaex.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = null;
        PrintWriter printWriter = null;

        try {
            Socket socket = new Socket("localhost", 9000);

            if (socket != null) {
                System.out.println("서버와 연결 성공");
                br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                printWriter = new PrintWriter(socket.getOutputStream());

                while (true) {
                    System.out.print("서버에 보낼 내용 = ");
                    String sendMessage = sc.nextLine();

                    printWriter.println(sendMessage);
                    printWriter.flush();

                    String message = br.readLine();
                    System.out.println("서버로부터 전달받는 메시지 = " + message);
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                printWriter.close();
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
