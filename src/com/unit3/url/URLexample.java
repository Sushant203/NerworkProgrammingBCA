package com.unit3.url;
import java.net.*;
public class URLexample {
    public static void main(String[] args) {
        try {
            // create a URL object for the web site we want to access
            URL url = new URL("https://www.google.com");
            // display the protocol of the URL (should be "https")
            System.out.println("Protocol: " + url.getProtocol());
            // display the host name of the URL (should be "www.example.com")
            System.out.println("Host Name: " + url.getHost());
            // display the port number of the URL (should be -1 since no port is specified)
            System.out.println("Port Number: " + url.getPort());
            // display the path component of the URL (should be an empty string since no path is specified)
            System.out.println("Path: " + url.getPath());
            // display the query component of the URL (should be null since no query is specified)
            System.out.println("Query: " + url.getQuery());

            // display the fragment component of the URL (should be null since no fragment is specified)
            System.out.println("Fragment: " + url.getRef());
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL");
        }
    }
}


