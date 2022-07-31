import java.util.*;
public class Perfect
{  
    public static void main(String args[])
    {   System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<no)

        {   if(no%i==0)
            {  
                sum=sum+i;


            }

            
            i++;
        }

        if(no==sum)
        {
        System.out.println("perfect number");

        }
        else
        {
           System.out.println("not prime numbrr");



        }
    }
}