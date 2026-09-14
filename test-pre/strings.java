public class strings {
    public static void main(String[]args){
    //check the starting value
    String req = "GET / index.html HTTP/1.1";
    System.out.println(req.startsWith("GET")); //true


    //print the substrings
    String file = req.substring(req.indexOf("/") /*start*/, req.indexOf("H")/*end*/);
    System.out.println(file); // /index.html 


        //print the parts after splitting
    String [] parts = req.split(" ");
    for(int i=0 ;i<parts.length;i++){
        System.out.println(parts[i]);
    }
    }
}

/* other functions for strings:
for checking equals:
equals()
equalsIgnoreCase()

for manipulating values:
repalce()
replaceAll()

for empty checks:
isEmpty()
isBlank()

*/