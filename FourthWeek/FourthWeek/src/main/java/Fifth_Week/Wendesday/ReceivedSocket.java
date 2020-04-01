package Fifth_Week.Wendesday;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ReceivedSocket {
    public static void main(String[] args) throws IOException {
        //服务器输出文本文件
        ServerSocket serverSocket = new ServerSocket(1123);

        Socket socket = serverSocket.accept();

        InputStreamReader ip = new InputStreamReader(socket.getInputStream());

        BufferedReader buf = new BufferedReader(ip);

        BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));

        String line = buf.readLine();
        while (line!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        bw.close();
        socket.close();
    }
}
