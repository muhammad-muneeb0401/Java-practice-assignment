
import java.util.Scanner;

public class Question6 {

    
   public static void main(String[] args) {
    
        int a,b,h,k;
        Scanner read = new Scanner (System.in);
        System.out.println("Enter length of first parallel side");
        a=read.nextInt();
        System.out.println("Enter length of second parallel side");
        b=read.nextInt();
        System.out.println("Enter perpendicular distance between thes sides");
        h=read.nextInt();
        k=h*(a+b);
        System.out.println("Area of Trapzoid ");
        System.out.println(k); 
        
       }
    }