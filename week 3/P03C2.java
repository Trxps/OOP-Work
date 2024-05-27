import java.util.*;
public class P03C2
{

   public static void main(String args[])
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      String myString1 = new String();
      String myString2 = new String();
      
      System.out.print ("Please enter the first string: ");
      myString1 = keyboardIn.nextLine();
      
      System.out.print ("Please enter the second string: ");
      myString2 = keyboardIn.nextLine();
      
      if (myString1.compareTo(myString2)== 0)
      
         System.out.println (" the two strings entered at the same");
         
      else if(myString1.compareTo(myString2)<0)
         
         System.out.println (myString1+ " comes before " +myString2 + " in the dictionary");
         
      else if(myString1.compareTo(myString2)>0)
      
         System.out.print(myString2+ " comes before " +myString1 + " in the dictionary");
         
   
   }
   
}
      

      
