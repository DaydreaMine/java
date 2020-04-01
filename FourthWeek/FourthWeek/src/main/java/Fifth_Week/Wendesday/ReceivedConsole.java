package Fifth_Week.Wendesday;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ReceivedConsole {
    public static void main(String[] args) throws IOException {

        //服务器输出到控制台

        ServerSocket serverSocket = new ServerSocket(1123);


        Socket socket = serverSocket.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(
                socket.getInputStream()));

        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }


        socket.close();
    }

}
