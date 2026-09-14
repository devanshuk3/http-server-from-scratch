package source;
import java.io.*;
import java.net.*;
import java.util.HashMap;

public class httpServer {
    public static void main (String [] args)throws IOException{
        int port = 8080;
        HashMap<String, String> headers  = new HashMap<>();
        ServerSocket server = new ServerSocket(port);
        System.out.println("Serving at port:"+ port);

        Socket client = server.accept();
        System.out.println("Client Connected!!");

        BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));

        String line;    
        //The lines below are for taking the values in strings 
        //and then printing them on the console.
        String requestLine = reader.readLine();
        String [] parts = requestLine.split(" ");
        String method = parts[0];

        String path = parts[1];
        String version = parts[2];
        System.out.println("Method: '" + method);
        System.out.println("Path" + path);
        System.out.println("Version: " + version);


        //for storing these headers in hashmaps
        while(!(line = reader.readLine()).isEmpty()){
           // System.out.println(line);
            int seperator = line.indexOf(":");
           // System.out.println(seperator);
            String key = line.substring(0, seperator).trim();
            String value = line.substring(seperator + 1).trim();
            headers.put(key, value);
        }
        System.out.println("Host - " + headers.get("Host"));
        System.out.println("User-Agent - " + headers.get("User-Agent"));
        System.out.println("Connection - " + headers.get("Connection"));


        String req = "<html><head> <title> devanshuuuu</title></head><body><h1>Hallooooo</h1></body></html>";
        PrintWriter writer = new PrintWriter(client.getOutputStream());
        writer.print("HTTP/1.1 200 OK\r\n");
        writer.print("Content-Type: text/html\r\n");
        writer.print("Content-Length: req.length()\r\n");
        writer.print("\r\n");
        writer.print(req);

        writer.flush();
        server.close();

    }
}
