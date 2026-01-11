
import java.util.Scanner;

public class Question4 {

    
   public static void main(String[] args) {
     
        Scanner read = new Scanner (System.in);
        double OriPrice,DisPer,DisSellingPrice;

        System.out.print("Enter Dis sel price");
        DisSellingPrice=read.nextDouble();
        System.out.print("Enter Discounted Per");
        DisPer=read.nextDouble();
        OriPrice = DisSellingPrice/(1-(DisPer/100));
        
        System.out.println("Ori Price");
        System.out.println(OriPrice);
   }

}

        