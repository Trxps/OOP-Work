import java.util.*;
public class P03C6
{

   public static void main(String args[])
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      String fullName;
      
      System.out.print("enter your full name: ");
      fullName = keyboardIn.nextLine();
      
      String [] names = fullName.split(" ");
      System.out.print("Your initials are ");
      for(int i = 0; i < names.length; i++)
      {
         System.out.print(names[i].charAt(0));
      }
         
   }
}