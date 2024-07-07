package serverclient;
import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args) throws IOException {
        int portNumber = 5001;
        ServerSocket serverSocket = new ServerSocket(portNumber);
        System.out.println("Server started, waiting for client...");

        Socket clientSocket = serverSocket.accept();
        System.out.println("Client connected...");

        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println("Client: " + inputLine);
            out.println("Server response: " + inputLine);
        }

        out.close();
        in.close();
        clientSocket.close();
        serverSocket.close();
    }
}
