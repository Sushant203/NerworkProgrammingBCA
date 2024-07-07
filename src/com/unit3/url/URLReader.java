package com.unit3.url;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.HttpURLConnection;

public class URLReader {
    public static void main(String[] args) throws Exception {
        // Replace the URL below with the actual URL you want to retrieve data from
        URL url = new URL("https://floweranimations.netlify.app/");

        // Open a connection to the URL
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        // Set the HTTP method to GET
        conn.setRequestMethod("GET");

        // Get the response code from the server
        int responseCode = conn.getResponseCode();

        // If the response code indicates success (200), read the data from the URL
        if (responseCode == 200) {
            BufferedReader in = new BufferedReader(
                new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Print the data retrieved from the URL
            System.out.println(response.toString());
        } else {
            System.out.println("Error: Could not retrieve data from URL.");
        }

        // Close the connection to the URL
        conn.disconnect();
    }
}

