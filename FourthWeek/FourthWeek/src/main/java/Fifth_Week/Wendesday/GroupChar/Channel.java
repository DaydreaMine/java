package Fifth_Week.Wendesday.GroupChar;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Channel implements Runnable {
    private DataInputStream dit = null;
    private DataOutputStream dot = null;

    public Channel(Socket socket) {
        try {
            dit = new DataInputStream(socket.getInputStream());
            dot = new DataOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    @Override
    public void run() {

    }


}
