
import java.util.Scanner;

public class Question8 {

    
   public static void main(String[] args) {
        
        double a,b,c,s,z,Area;
        Scanner read = new Scanner (System.in);
        System.out.println("Enter a");
        a=read.nextInt();
        System.out.println("Enter b");
        b=read.nextInt();
        System.out.println("Enter c");
        c=read.nextInt();
        s=(a+b+c)/2;
        z=s*(s-a)*(s-b)*(s-c);
        Area=Math.sqrt(z);
        System.out.println("Area of Triangle ");
        System.out.println(Area); 
   }
}