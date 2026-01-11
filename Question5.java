
import java.util.Scanner;

public class Question5 {

    
   public static void main(String[] args) {
        
        double volts,amperes,watts;
        Scanner read = new Scanner (System.in);
        System.out.println("Enter Volts");
        volts=read.nextInt();
        System.out.println("Enter Amperes");
        amperes=read.nextInt();

        watts=volts*amperes;
        System.out.println("Watts ");
        System.out.println(watts); 
   }

}