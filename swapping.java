import java.util.*;
public class swapping 

{ public static void main(String args[])
    { int temp;
    System.out.println("enter the value of a,b");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
     System.out.println("Befor swapping"+"\n"+a+"\n"+b);
      
      temp=a;
      a=b;
      b=temp;

      System.out.println("After swapping"+"\n"+a+"\n"+b);






    }

 
}
