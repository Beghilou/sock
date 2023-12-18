import java.io.*;
import java.net.*;

public class ServerTCP1 {

    public static void main(String[] args) {
        try {
            ServerSocket socketServer = new ServerSocket(2016);
            System.out.println("Serveur en attente");

            Socket socket = socketServer.accept();
            System.out.println("Connection d'un client");

            DataInputStream dIn = new DataInputStream(socket.getInputStream());
            System.out.println("Message: " + dIn.readUTF());

            socket.close();
            socketServer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
