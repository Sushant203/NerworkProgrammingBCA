package serverclient;
import java.io.*;
import java.net.*;

public class Client {

    public static void main(String[] args) throws IOException {
        String serverHostname = "localhost";
        int serverPort = 5001;

        try (Socket socket = new Socket(serverHostname, serverPort);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("server snga connect vayo...");

            String userInput;
            while ((userInput = stdIn.readLine()) != null) {
                out.println(userInput);
                String serverResponse = in.readLine();
                System.out.println("server response: " + serverResponse);
            }
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to " + serverHostname);
            e.printStackTrace();
        }
    }
}
