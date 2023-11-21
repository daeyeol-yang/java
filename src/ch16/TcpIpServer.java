package ch16;


import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class TcpIpServer {
    public static void main(String[] args) {
        ServerSocket serverSocket =null;

        try {
            serverSocket = new ServerSocket(7777);
            System.out.println(getTime()+"서버가 준비되었습니다.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        while (true){
            System.out.println(getTime()+"연결요청을 기다립니다.");
            //서버 소켓은 클라이언트의 연결요청이 올때까지 실행을 멈추고 기다린다.
            //클라이언트의 연결요청이 오면 클라이언트 소켓과 통신할 새로운 소켓을 생성한다.
            try {
                Socket socket = serverSocket.accept();//ServerSocket.accept() 메서드는 클라이언트가 연결 요청을 하면, 이를 수락하고 클라이언트와의 통신을 위한 소켓을 생성하여 반환합니다.
                System.out.println(getTime()+" "+socket.getInetAddress()+"로부터 연결요청이 들어왔습니다.");

                OutputStream out = socket.getOutputStream();
                DataOutputStream dos = new DataOutputStream(out);

                dos.writeUTF("[Notice] Test Message1 from Server");
                System.out.println(getTime()+"데이터를 전송했습니다.");
                dos.close();
                socket.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    static String getTime(){
        SimpleDateFormat f = new SimpleDateFormat("[hh:mm;ss]");
        return f.format(new Date());
    }
}
