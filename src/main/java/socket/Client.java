package socket;

import java.io.IOException;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {
        try{
            System.out.println("Client started");
            Socket soc = new Socket("localhost", 8002);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
