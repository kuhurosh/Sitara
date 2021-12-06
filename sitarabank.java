import java.util.*;
import java.net.*;
import java.io.*;
import java.util.*;
class sitarabank
{
    public static void main (String[]args) throws UnknownHostException
    {
        //variables start here

        //variables end here
        //internet address start here
         InetAddress localhost = InetAddress.getLocalHost();
         System.out.println("SYSTEM IP ADDRESS : " +(localhost.getHostAddress()).trim());
         String systemipaddress = "";
         try
         {
         URL url_name = new URL("http://bot.whatismyipaddress.com");
         BufferedReader sc = new BufferedReader(new InputStreamReader(url_name.openStream()));
         systemipaddress = sc.readLine().trim();
         }
         catch (Exception e)
         {
         }
         //internet address end here
         //user interface start here
         Scanner sc = new Scanner(System.in);
         System.out.println("");
         System.out.println("KINDLY ENTER YOUR FIRST NAME");
         String namone = sc.nextLine();
         System.out.println("KINDLY ENTER YOUR SURNAME");
         String namtwo = sc.nextLine();
         System.out.println("");
         System.out.println("HELLO-"+namone.toUpperCase());
         System.out.println("WELCOME TO SITARA BANKING SERVER");
         System.out.println("");
         System.out.println("WE ARE UNDER DEVLOPMENT YOU CAN FACE SOME ERRORS");
         System.out.println("");
         System.out.println("AS PER BANKING NORMS WE NEED TO STORE YOUR NAME AND INTERNET ADDRESS FOR SECURITY PURPOSE");
         System.out.println("");
         //user interface end here


    }
}