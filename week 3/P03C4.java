import java.util.*;
public class P03C4
{

   public static void main(String args[])
   {
      Scanner keyboardIn = new Scanner(System.in);
      char first;
      char middle;
      char last;
      String fullName;
      
      System.out.print("Enter the full name: ");
      fullName = keyboardIn.nextLine();
      
      first = fullName.charAt(0);
      middle = fullName.charAt(fullName.indexOf(" ") + 1);
      last = fullName.charAt(fullName.lastIndexOf(" ") + 1);
      System.out.println("Your intials are " + first + middle + last);

   
   }
}