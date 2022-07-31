import java.util.*;
public class countDigit 
{
    public static void main(String args[])
    {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();

        int count=0;
        for(;no!=0;)   //while(no!=0)
        {
            no=no/10;
            ++count;

        
        }
        System.out.println("count of Digit is :"+count);
    }
    
}
