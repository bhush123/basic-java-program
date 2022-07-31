import java.util.*;

public class Armstrong
{  
    public static void main(String x[])
    {
    int sum=0;
    System.out.println("Enter the number");
    Scanner sc=new Scanner(System.in);
    int  no=sc.nextInt();
    
    int temp=no;

    while(no!=0)
    {
        int rem=no%10;
            no=no/10;
            sum=sum+rem*rem*rem;

    }
    if(sum==temp)
    {
        System.out.println("Armstrong number");


    }
    else
    {
        System.out.println("Not Armstrong");
    }

    }


    
}
