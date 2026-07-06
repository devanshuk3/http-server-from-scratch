package source;
import java.io.*;
import java.net.*;

public class httpServer {
    public static void main (String [] args)throws IOException{
        int port = 8080;
        ServerSocket server = new ServerSocket(port);
        System.out.println("Serving at port:"+ port);

        Socket client = server.accept();
        System.out.println("Client Connected!!");

        BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));

        String line;
        String requestLine = reader.readLine();
        String [] parts = requestLine.split(" ");
        String method = parts[0];
        String path = parts[1];
        String version = parts[2];


        System.out.println("Method: " + method);
        System.out.println("Path" + path);
        System.out.println("Version: " + version);

        while(true){
            if((line = reader.readLine())!=null){

                if(line.isEmpty())break;

                System.out.println(line);
            }
        }

        PrintWriter writer = new PrintWriter(client.getOutputStream());
        writer.print("HTTP/1.1 200 OK\r\n");
        writer.print("Content-Type: text/plain\r\n");
        writer.print("Content-Length: 15\r\n");
        writer.print("\r\n");
        writer.print("Hello World!!!!!");

        writer.flush();
        server.close();

    }
}
