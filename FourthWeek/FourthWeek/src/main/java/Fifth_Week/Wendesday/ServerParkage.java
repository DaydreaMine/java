package Fifth_Week.Wendesday;

import java.io.*;
import java.net.Socket;

public class ServerParkage implements Runnable {
    private Socket socket;

    public ServerParkage(Socket socket) {
        this.socket = socket;
    }


    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
            String line = br.readLine();
            while (line!=null){
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

            bw.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
