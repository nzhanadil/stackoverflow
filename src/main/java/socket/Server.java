package socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

        try{
            System.out.println("waiting for clients...");
            ServerSocket ss = new ServerSocket(8002);
            Socket soc = ss.accept();
            System.out.println("Connection established");

        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
