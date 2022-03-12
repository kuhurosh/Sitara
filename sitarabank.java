import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import javax.lang.model.util.ElementScanner14;
class sitarabank
{
    public static void main (String[]args) throws UnknownHostException
    {
        try {
        URL url = new URL("http://www.google.com");
        URLConnection connection = url.openConnection();
        connection.connect();
        System.out.println("Internet is connected");

        //variables start here  
        int max = 20;
        int min = 1;
        int i;
        int z;
        String usw = "YOUR CHOICE IS INVALID";
        //variables end here
        //java version handler
         System.out.println("");
         System.out.println("CREATED BY TEAMROSH FINTECH SOLUTIONS");
         System.out.println("");
         System.out.println("Java Version is : "+System.getProperty("java.version"));
         System.out.println("");
         System.out.println("Java Version Date : "+System.getProperty("java.version.date"));
         System.out.println("");
         System.out.println("Java Vendor : "+System.getProperty("java.vendor"));
         System.out.println("");     
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
         System.out.println("VERSION 1.0");
         System.out.println("");
         System.out.println("KINDLY ENTER YOUR FIRST NAME");
         String namone = sc.nextLine();
         System.out.println("KINDLY ENTER YOUR SURNAME");
         String namtwo = sc.nextLine();
         System.out.println("");
         System.out.println("HELLO - "+namone.toUpperCase().trim());
         System.out.println("");
         System.out.println("WELCOME TO SITARA BANKING SERVER");
         System.out.println("");
         System.out.println("WE ARE UNDER DEVLOPMENT YOU CAN FACE SOME ERRORS");
         System.out.println("");
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
         System.out.println("AS PER BANKING NORMS WE NEED TO STORE YOUR NAME AND INTERNET ADDRESS FOR SECURITY PURPOSE");
         System.out.println("");
         }
         else
         {
         System.out.println("");
         }
         System.out.println("PLEASE ADD BOTH THE "+random_int_one+" + "+random_int_two+" NUMBER'S TO VERIFY YOURSELF");
         System.out.println("YOU HAVE "+i+" CHANCES LEFT");
         int sumca = 8-i;
         System.out.println("CHANCES USED "+i);
         int userenone = sc.nextInt();
         if(i==4)
         {
         System.out.println("");
         System.out.println("YOU HAVE USED YOUR CHANCES");
         System.out.println("      TRY AGAIN LATER     ");
         System.exit(0);
         }
         if(userenone == vone)
         {
         System.out.println("");
         System.out.println("YOU HAVE SUCCESSFULLY VERIFIED YOURSELF - "+namone.toUpperCase().trim());
         System.out.println("");
         System.out.println("TO CHOOSE ANY OPTION JUST TYPE 1 OR 2");
         System.out.println("1. NEW USER");
         System.out.println("2. OLD USER");
         int userchone = sc.nextInt();
         switch(userchone)
         {
         case 1:
         {
         System.out.println("");
         System.out.println("TO CHOOSE ANY OPTION JUST TYPE 1 OR 2");
         System.out.println("1. NEW ACCOUNT");
         System.out.println("2. CREATE VPA ID");
         System.out.println("3. CREATE TEMPORARY WALLET");
         int userchtwo = sc.nextInt();
         switch(userchtwo)
         {
         case 1:
         {
         System.out.println("");
         System.out.println("HI");
         System.out.println("   "+namone.toUpperCase().trim());
         System.out.println("");
         System.out.println("WE ARE HAPPY :-) THAT YOU SHOWED INTEREST IN SITARA");
         System.out.println("");
         while(true)
         {
         for(z=0;z<=4;z++)
         {
         if(z==3)
         {
         System.out.println("");
         System.out.println("PLEASE TRY AGAIN LATER");
         System.exit(0);
         }
         System.out.println("");
         System.out.println("KINDLY ENTER YOUR COUNTRY CODE");
         int pnum = sc.nextInt();
         System.out.println("");
         System.out.println("KINDLY ENTER YOUR PHONE NUMBER");
         long userphone = sc.nextLong();
         int copynumtwo = pnum;
         long copynumone = userphone;
         long numcheckone = 0;
         while(userphone>0)
         {
         userphone = userphone/10;
         numcheckone++;
         }
         if(numcheckone==0)
         {
         System.out.println("");
         System.out.println("PLEASE ENTER CORRECTLY");
         System.out.println("");
         }
         else if(numcheckone==10)
         {
         System.out.println("");
         System.out.println("YOUR PHONE NUMBER IS "+"+"+copynumtwo+" "+copynumone);
         System.out.println("");
         System.out.println("TYPE (1) IF IT IS CORRECT");
         System.out.println("FOR RESUBMITTING YOUR NUMBER TYPE (0)");
         int userchthree = sc.nextInt();
         if(userchthree==1)
         {
         System.out.println("");    
         System.out.println("KINDLY SELECT BETWEEN 1 TO 4");
         System.out.println("1. UID NUMBER");
         System.out.println("2. PAN CARD");
         System.out.println("3. VOTER ID");
         System.out.println("4. DRIVING LICENSE");
         int userchfour = sc.nextInt();
         switch(userchfour)
         {
         case 1:
         {
                 
         }
         default:
         {
         System.out.println();
         int ce = 2-z;
         System.out.println(""+ce+" CHANCES LEFT TO INPUT CORRECT NUMBER");
         System.out.println(usw);
         System.out.println();
         }
         //mark
         }
         }
         else if(userchthree==0)
         {
         System.out.println("");
         System.out.println("RESUBMITION");
         int v = 2-z;
         System.out.println(""+v+" CHANCES LEFT TO INPUT CORRECT NUMBER");
         System.out.println("");
         }
         else
         {
         System.out.println();
         System.out.println(usw);
         System.exit(0);
         }
         }
         else
         {
         System.out.println("");
         System.out.println("WRONG NUMBER :-(");
         int x = 2-z;
         System.out.println("YOU HAVE "+x+" CHANCES LEFT TO INPUT CORRECT NUMBER");
         System.out.println("");
         }
         }
         }
         }
         case 2:
         {
            System.out.println("Hi");
         break;
         }
         case 3:
         {
         break;
         }
         default:
         {
         System.out.println();
         System.out.println(usw);
         System.out.println();
         }
         //mark
         }
         break;
         }
         case 2:
         {
         System.out.println("two");
         break;
         }
         default:
         {
         System.out.println();
         System.out.println(usw);
         System.out.println();
         }
         //mark
         }
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
        catch (MalformedURLException e) 
        {
            System.out.println("INTERNET IS NOT CONNECTED");
        } 
         catch (IOException e) 
        {
            System.out.println("INTERNET IS NOT CONNECTED");
        }
    }
}