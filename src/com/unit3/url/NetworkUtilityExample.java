package com.unit3.url;

import java.io.*;
import java.net.*;
public class NetworkUtilityExample {
    // This is a utility method that establishes a connection between a client and server.
    public static void establishConnection(String serverIP, int serverPort) throws IOException {  
        // Create a new Socket object and connect it to the server at the specified IP address and port number.
        Socket socket = new Socket(serverIP, serverPort);
        // Print a message indicating that the connection has been established.
        System.out.println("Connection established with server at " + serverIP + ":" + serverPort);
        // Close the socket to end the connection.
        socket.close();
        // Print a message indicating that the connection has been closed.
        System.out.println("Connection closed");
    }
    public static void main(String[] args) {
        // Specify the IP address and port number of the server.
        String serverIP = "192.168.1.1";
        int serverPort = 8080;
        try {
            // Call the utility method to establish a connection with the server.
            establishConnection(serverIP, serverPort);
        } catch (IOException e) {
            // If an exception occurs, print an error message.
            System.err.println("Error: " + e.getMessage());
        }
    }
}
  
