import java.util.*;
public class EmployeeInfo 
{
    public static void main(String args[])
    {   
        
       
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name");
        String name=sc.nextLine();
        System.out.println("enter the id");
        int id=sc.nextInt();
        System.out.println("enter the salary");
        int sal=sc.nextInt();

        System.out.println("id is:"+id);
        System.out.println("name is"+name);
        System.out.println("salary is:"+sal);



    }
    
}
