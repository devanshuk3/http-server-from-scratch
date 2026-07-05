public class stringBuilders {
    public static void main(String[] args){
    StringBuilder response = new StringBuilder();

        response.append("HTTP/1.1 200 OK\r\n");  //content-headers
        response.append("Content-Type: text/plain \r\n");;  //content-metadata
        response.append("\r\n"); //line break for browsers to understand seperation of headers and body
        response.append("hello");//body or payload
        System.out.println(response);

        String responseString = response.toString(); //converts the stringbuilder to string
        //int len = response.length(); //used to compute the content-length
        System.out.println(responseString);
    }
}


//other important sb functions:    charAt(i), insert(5, "Hello"), delete(5,10), deleteCharAt(4)