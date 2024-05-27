import java.util.Scanner;
public class P03C5
{

   public static void main(String args[])
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      String fullName;
      
      System.out.print("enter your full name: ");
      fullName = keyboardIn.nextLine();
      
      String [] names = fullName.split(" ");
      for(int i = 0; i < names.length; i++)
      {
        System.out.println(names[i]);
        
        }
     }
   
