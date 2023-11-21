package ch16;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpIpserver2 {
    public static void main(String[] args) {
        ServerSocket serverSocket =null;

        try {
            serverSocket = new ServerSocket(7777);
            System.out.println(getTime()+"서버가 준비되었습니다.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        while (true){
            try {
                Socket socket = serverSocket.accept();
                System.out.println(getTime()+socket.getInetAddress()+"로부터 연결 요청이 들어왔습니다.");
                System.out.println("getPort(): "+socket.getPort());
                System.out.println("getLocalPort():"+socket.getLocalPort());

                OutputStream out = socket.getOutputStream();
                DataOutputStream dos = new DataOutputStream(out);

                dos.writeUTF("[Notice] Test Message1 from Server.");
                System.out.println(getTime()+"데이터를 전송하였습니다.");

                dos.close();
                socket.close();

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static String getTime(){
        SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
        return f.format(new Date());
    }
}
