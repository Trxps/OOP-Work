import java.util.Scanner;
public class P03B6
{
   public static void main(String[] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      String string1 = new String();
      String string2 = new String();
      
    
      System.out.print("Please enter a string: ");
      string1 = keyboardIn.nextLine();
      System.out.print("Please enter another string: ");
      string2 = keyboardIn.nextLine();
      
     
      if(string1.contains(string2))
      {
         System.out.print(string1 +" contains the text " +string2);   
      }
      
      else
      {
         System.out.print(string1 +" does not contain the text " +string2);   
      }
      
   } 
    
}