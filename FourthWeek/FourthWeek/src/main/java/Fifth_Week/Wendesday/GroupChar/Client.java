package Fifth_Week.Wendesday.GroupChar;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.0.104",1123);
        BufferedReader br = new BufferedReader(new FileReader("a.java"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String line = null;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        // 释放资源
        br.close();
        socket.close();

    }
}
