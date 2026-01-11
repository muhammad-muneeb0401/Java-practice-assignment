
import java.util.Scanner;

public class Question2 {

    
   public static void main(String[] args) {
        
       double Rad,C,A;
       Scanner read = new Scanner(System.in);
       System.out.println("Enter Radius");
       Rad =read.nextDouble();
       System.out.println("circumference");
       C = 2 * Math.PI * Rad;
     System.out.println(C);
      System.out.println("Area");
      A = Math.PI * Math.pow(Rad,2);
      System.out.println(A);
   }
}