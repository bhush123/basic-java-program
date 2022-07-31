import java.util.Scanner;
public class Findpower
 {
   public static void main(String args[])
   {
      System.out.println("Enter the base and index");
      Scanner sc=new Scanner(System.in);

      int  base=sc.nextInt();
      int index=sc.nextInt();
      int p=1;

      for(int i=1;i<=index;i++)
      {
          p=p*base;
      }
      System.out.println("Power is :"+p);





   }

    
}
