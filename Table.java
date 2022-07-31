import java.util.*;
public class Table 
{
    public static void main(String x[])
    {
        int no;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();

        for(int i=1;i<=10;i++)
        {
           System.out.println(no*i);
        }
    }

}
