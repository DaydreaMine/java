package Fifth_Week.Wendesday;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class SentTxt {
    public static void main(String[] args) throws IOException {
        //客户端文本文件
        Socket socket=new Socket("192.168.0.104",1123);
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
        String line = br.readLine();

        while (line!= null) {
            pw.println(line);
        }

        socket.shutdownOutput();

        BufferedReader brIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String str = brIn.readLine();
        System.out.println("server:" + str);

        br.close();
        socket.close();
    }
}
