package com.unit3.url;

import java.net.URL;
public class URLSplitter {
  public static void main(String[] args) throws Exception {
    String urlString = "https://www.example.com/path/to/file.html?query1=value1&query2=value2#fragment";
    URL url = new URL(urlString);
    String protocol = url.getProtocol();
    String host = url.getHost();
    int port = url.getPort();
    String path = url.getPath();
    String query = url.getQuery();
    String fragment = url.getRef();
    System.out.println("Protocol: " + protocol);
    System.out.println("Host: " + host);
    System.out.println("Port: " + port);
    System.out.println("Path: " + path);
    System.out.println("Query: " + query);
    System.out.println("Fragment: " + fragment);
  }
}

