import java.util.Scanner;
public class P01C3
{
   public static void main(String[] args)
   {      
      Scanner keyIn = new Scanner(System.in);
      double weight, height;
      System.out.println("Enter your weight in kgs: ");
      weight = keyIn.nextDouble();
      System.out.println("Enter your height in meters: ");
      height = keyIn.nextDouble();
      calculateBMI(weight, height);
   }
   
   public static void calculateBMI(double weight, double height)
   {
      double BMI = weight/(height*height);
      System.out.println("Your BMI is: " + BMI);
   }
}
