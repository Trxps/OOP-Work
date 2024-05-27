import java.util.*;
public class P01B2
{

   public static void main(String args[])
   {
   Scanner keyIn = new Scanner (System.in);
   int num1, num2;
   System.out.print ("input number 1: ");
   num1 = keyIn.nextInt();
   System.out.print ("input number 2: ");
   num2 = keyIn.nextInt();
   displayNumbers(num1, num2);
   }
   
   public static void displayNumbers (int num1, int num2)
   {
      for (int i = num1; i <= num2; i++)
      System.out.print(i +" ");
      
      }}
   