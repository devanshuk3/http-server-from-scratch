import java.io.*;
import java.net.*;

public class sockets {
    public static void main(String [] args){
                int port = 8080;

                try(ServerSocket serverSocket = new ServerSocket(port)){
                    System.out.println("Serving at port:" + port);

                while(true){
                    Socket client = serverSocket.accept();
                    System.out.println("Client connectedd!!"+ client.getInetAddress());

                    BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
                     
                    PrintWriter writer = new PrintWriter(client.getOutputStream(), true);

                    String line;
                    
                    while((line = reader.readLine()) != null){
                        System.out.println(line);

                        if(line.isEmpty())break;
                    }
                    client.close();
                    System.out.println("client disconnected!!");
                }
    }
    catch(IOException e){
        e.printStackTrace();
    }
}
}
