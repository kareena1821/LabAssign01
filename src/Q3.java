import java.util.*;
//19105112 Kareena
public class Q3 {
    public static void main(String[] args){
        
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter Dividend:");
       int dividend= sc.nextInt();
       System.out.println("Enter Divisor:");
       
       int divisor=sc.nextInt();
       sc.close();
       if (divisor==0){
        System.out.println("Divide by Zero Not Permissible");
         return;
       }
       int  quotient= dividend/divisor;
       int remainder= dividend%divisor;
       System.out.println("Quotient = "+ quotient);
       
       System.out.println("Remainder = "+remainder);
       


    }
    
}