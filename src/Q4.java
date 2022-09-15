import java.util.*;
//19105112 Kareena
public class Q4 {
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first=sc.nextInt();
        System.out.println("Enter second number:");
        int second=sc.nextInt();
        int firstcopy=first;
        int secondcopy=second;
        System.out.println("With Temporary Variable:");

        int auxiliary= firstcopy;
        firstcopy=secondcopy;
        secondcopy=auxiliary;
        System.out.println("First Number= "+ firstcopy);
        System.out.println("Second Number= "+secondcopy);

        first=first+second;
        second=first-second;
        first=first-second;
        System.out.println("With Temporary Variable:");
        System.out.println("First Number= "+ first);
        System.out.println("Second Number= "+second);
        
       sc.close(); 

    }
    
    
}
    

