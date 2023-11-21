package ch16;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class TcpIpClient {
    public static void main(String[] args) {
        try {
            String serverIP="127.0.0.1";
            System.out.println("서버에 연결중입니다. 서버IP:"+ serverIP);
            Socket socket = new Socket(serverIP,7777);// 소켓을 생성하여 연결 요청

            InputStream in = socket.getInputStream();
            DataInputStream dis = new DataInputStream(in);

            System.out.println("서버로부터 받은 메시지: "+ dis.readUTF());
            System.out.println("연결을 종료합니다.");

            dis.close();
            socket.close();
            System.out.println("연결이 종료되었습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
