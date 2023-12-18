import java.io.*;
import java.net.*;

public class ServerUDP {

    public static void main(String[] args) {
        try {
            DatagramSocket sock = new DatagramSocket(1234);

            while (true) {
                System.out.println("-waiting data");
                byte[] buffer = new byte[1024];
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                sock.receive(packet);
                String str = new String(packet.getData(), 0, packet.getLength());
                System.out.println("str=" + str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

