package server;

import java.io.IOException;
import java.net.ServerSocket;

public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6823);
        Server server = new Server(serverSocket);
        server.start();
    }
}
