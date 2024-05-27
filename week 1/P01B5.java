import java.util.Scanner;
public class P01B5
{
   public static void main(String[] args)
   {      
      singSong("Wheel", "Round and Round");
      singSong("Wipers", "Swish, Swish, Swish");
      singSong("Driver", "Move on back");
      singSong("People", "Chatter, Chatter, Chatter");
      singSong("Horn", "Beep, Beep, Beep");
      singSong("Baby", "Whaaa, Whaaa, Whaaa");
   }
   
   public static void singSong(String object, String sound)
   {
      System.out.println("The "+object+" on the bus go "+sound+",");
      System.out.println(sound);
      System.out.println(sound);
      System.out.println("The "+object+" on the bus go "+sound+",");
      System.out.println("All day long");
   }
}