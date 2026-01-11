
import java.util.Scanner;

public class Question3 {

    
   public static void main(String[] args) {
     double OriPrice,DisPrice,DisSellingPrice;
       Scanner read = new Scanner (System.in);
       System.out.print("Enter Original price");
        OriPrice=read.nextDouble();
        System.out.print("Enter Discounted Price");
        DisPrice=read.nextDouble();
    
        DisSellingPrice = OriPrice - DisPrice;
        
        System.out.println("DisSellingPrice");
        System.out.println(DisSellingPrice);
   }

}