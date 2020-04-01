package Fifth_Week.Wendesday;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;
/*客户端键盘录入，服务器输出文本文件
        客户端文本文件，服务器输出到控制台
        客户端文本文件，服务器输出文本文件
        上传图片案例
        服务器的代码用线程进行封装，这样可以模拟一个同时接收多人上传文件的服务器。(用循环也可以但是效率低，是单线程的程序)
*/

public class SentSocket {


    public static void main(String[] args) throws IOException {
        //客户端键盘录入
        Socket socket = new Socket("192.168.0.104",1123);
        Scanner scanner =new Scanner(System.in);
        OutputStream os = socket.getOutputStream();
        System.out.println("输入数据:");
        String str = scanner.nextLine();
        os.write(str.getBytes());
        os.flush();
        socket.shutdownOutput();

        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[200];
        int len = is.read(bytes);
        str = new String(bytes,0,len);
        System.out.println(str);




    }
}
