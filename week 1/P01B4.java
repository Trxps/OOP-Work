import java.util.*;
public class P01B4
{

   public static void main(String args[])
   {
   Scanner KeyIn = new Scanner (System.in);
   double item, amount;
   
   System.out.print ("Enter the cost of this item: ");
   item = KeyIn.nextDouble();
   
   System.out.print ("Enter the amount tendered: ");
   amount = KeyIn.nextDouble();
   
   receiptDisplay(item, amount);
   }
   
   public static void receiptDisplay(double item, double amount)
   {
      double vat, total, change;
      vat = item*0.135;
      total = vat + item;
      
      change = amount - total;
      
     System.out.println ("*********************");
     System.out.println ("Price of item:" + item);
     System.out.println ("VAT (13.5%): " + vat);    
     System.out.println ("Total Pricee  " + total);
     
     System.out.println ("**************************");
     
     System.out.println ("Amount tendered  " + amount);
     System.out.println ("Change  " + change);
     
     System.out.println ("*****************************");     
     
     }
     }