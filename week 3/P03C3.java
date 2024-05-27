import java.util.*;
public class P03C3
{

   public static void main(String args[])
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      String phoneNum = new String();
      String country = new String();
      String area = new String();
      String exchange = new String();
      String number = new String();
      
      System.out.print ("Please enter the 14 digit telephone: ");
      phoneNum = keyboardIn.nextLine();
      
      System.out.println("Country Code/tArea code/tExchange/tNumber");
      country = phoneNum.substring(0, 5);
      area = phoneNum.substring(5, 7);
      exchange = phoneNum.substring(7, 9);
      number = phoneNum.substring(9, phoneNum.length());
      System.out.print(country+"\t\t" );
      System.out.print("0" +area+"\t\t" );
      System.out.print(exchange+"\t\t" );
      System.out.print(number);
   
   }
   
}

