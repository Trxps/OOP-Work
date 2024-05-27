import java.util.*;
public class P01B1
{

   public static void main(String args[])
   {
      singVerse ("Cow", "Moo");
      singVerse ("Dog", "Woof");
      singVerse ("Cat", "Meow");
      singVerse ("Chicken", "Bok");
      
   }
    
   public static void singVerse(String animal, String sound)
   {
      System.out.println("Old MacDonald had a farm, E-I-E-I-O!");
      System.out.println("And on his farm he had a " + animal + ", E-I-E-I-O!");
      System.out.println("With a " + sound + "-" + sound + "here and a" + sound + "-" + sound + " there,");
      System.out.println("Here a " + sound + ", there a " + sound + ",");
      System.out.println("Everywhere a " + sound + "-" + sound + ",");
      System.out.println("Old MacDonald had a farm, E-I-E-I-O!");
   }
}
