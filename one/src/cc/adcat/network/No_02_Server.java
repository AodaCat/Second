package cc.adcat.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class No_02_Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(10010);
            while (true) {
                Socket socket = serverSocket.accept();
                new Thread(()->{
                    try {
                        InputStream is = socket.getInputStream();
                        int length;
                        byte[] temp = new byte[1024];
                        while ((length = is.read(temp)) != -1) {
                            System.out.println(new String(temp, 0, length));
                        }
                        socket.shutdownInput();

                        OutputStream os = socket.getOutputStream();
                        os.write("服务器收到".getBytes());
                        socket.shutdownOutput();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }).start();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
