import java.util.*;
public class StudentPercentage 
{
  public static void main(String x[])
  {
      System.out.println("Entr the six subject marks");
      Scanner sc=new Scanner(System.in);
      int s1,s2,s3,s4,s5,s6,agg,per;
      

      s1=sc.nextInt();
      s2=sc.nextInt();
      s3=sc.nextInt();
      s4=sc.nextInt();
      s5=sc.nextInt();
      s6=sc.nextInt();

        agg=s1+s2+s3+s4+s5+s6;

        per=agg/6;
        System.out.println("percentege is:"+per);

        if(per>50)
        {
            System.out.println("Student pass");
        }
        else
        {
            System.out.println("student fail");
        }
        
      

  }

    
}
