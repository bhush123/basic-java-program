import java.util.*;
public class fabonacci 
{
    public static void main(String args[])
    {

        int f1=0,f2=1,fib;
        System.out.println(f1+" \n"+f2);
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();

        for(int i=1;i<no;i++)
        {
            fib=f1+f2;
            f1=f2;
            f2=fib;
            System.out.println(fib);

        }







    }
    
}
