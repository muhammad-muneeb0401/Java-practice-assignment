
import java.util.Scanner;

public class Question1 {

    
   public static void main(String[] args) {
        int mm ;
        int om ;
         Scanner read = new Scanner (System.in);
        System.out.println("Enter maximum marks");
        mm=read.nextInt();
        System.out.println("Enter obtain marks");
        om=read.nextInt();
    
        double p;
        p = 1.0 * om /mm * 100;
        System.out.println(p);
           }
        }