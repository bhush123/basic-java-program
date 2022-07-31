import java.util.Scanner;
public class DuckNumber 
{
    public static void main(String args[])
    {
        System.out.println("Enter the number");
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=false;
        
        for(;n!=0;)    //while(no!=0)
        {
           int rem=n%10;
               n=n/10;

               if(rem==0)
               {
                   flag=true;
                   break; 
               }

        }

        if(flag)
        {
            System.out.println("Duck number");

        }
        else
        {
            System.out.println("not Duck number");
            
        }
    
        
    }
}
