package cc.adcat.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class No_02_Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 10010);

            OutputStream os = socket.getOutputStream();
            os.write("嘤嘤嘤".getBytes());
            socket.shutdownOutput();

            InputStream is = socket.getInputStream();
            int length;
            byte[] temp = new byte[1024];
            while ((length = is.read(temp)) != -1){
                System.out.println(new String(temp,0,length));
            }
            socket.shutdownInput();

            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
