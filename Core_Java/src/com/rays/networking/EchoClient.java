
package com.rays.networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 5643);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        System.out.println("Client Started");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        while (line != null) {
            out.println(line);
            System.out.println("Echo: " + in.readLine());

            if ("Bye".equals(line)) {
                break;
            }
            line = br.readLine();
        }
        out.close();
        in.close();
        br.close();
        socket.close();
    }
}
