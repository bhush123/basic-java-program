
import java.util.*;

public class ReverseNumber {
    public static void main(String[] x) {
        int rev=0;
        
        System.out.println("enter the number you want");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();

        


    
    
    
        while(no!=0)
     {
        int rem=no%10;
         no=no/10;
        rev=rev*10+rem;
     }
     
       System.out.println(rev);



    }
}
