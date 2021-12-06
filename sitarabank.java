import java.util.*;
import java.net.*;
import java.io.*;
import java.util.*;
class sitarabank
{
    public static void main (String[]args) throws UnknownHostException
    {
        //variables start here
        int max = 20;
        int min = 1;
        int i;
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
         while(true)
         {
         for(i=0;i<=4;i++)
         {
         int random_int_one = (int)Math.floor(Math.random()*(max-min+1)+min); //CAPTCHA GENRATOR
         int random_int_two = (int)Math.floor(Math.random()*(max-min+1)+min); //CAPTCHA GENRATOR
         int vone = random_int_two+random_int_one;
         if(i<1)
         {
         System.out.println("WE MAY STORE YOUR INTERNET PROTOCOL AND NAME FOR SECURITY REASONS");
         System.out.println("");
         }
         else
         {
         System.out.println("");
         }
         System.out.println("PLEASE ADD BOTH THE "+random_int_one+" + "+random_int_two+" NUMBER'S TO VERIFY YOURSELF");
         System.out.println("YOU HAVE 3 CHANCES TO VERIFY");
         System.out.println("CHANCES USED "+i);
         int userenone = sc.nextInt();
         if(i==3)
         {
         System.out.println("");
         System.out.println("YOU HAVE USED YOUR CHANCES");
         System.out.println("      TRY AGAIN LATER     ");
         System.exit(0);
         }
         if(userenone == vone)
         {
         System.out.println("sucesss");
         }
         else
         {
         System.out.println("");
         System.out.println("TRY AGAIN PLEASE");
         System.out.println("");
         }
         //user interface end here
         }
        }


    }
}