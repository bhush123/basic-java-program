import java.util.*;
public class PalindromeNumber
 { 
     public static void main(String[] x)
     { 
         int rev=0;

         System.out.println("enter the number");
         Scanner sc=new Scanner(System.in);
         int no=sc.nextInt();
         int temp=no;

         while(no!=0)
         {
            int  rem=no%10;
              no=no/10;
            rev=rev*10+rem;

         }

         if(temp==rev)
         {
             System.out.println("palindrome number");
         }
         else{
               System.out.println("not palindrome");
         }

     }




 }   




