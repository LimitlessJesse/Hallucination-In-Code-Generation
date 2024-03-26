import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocket_4 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("Server is listening on port 8080");

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Client connected");

                // Here you can add your logic to handle the client socket
                // For example, you can create a new thread to handle the client socket
                // new ClientHandler(socket).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
