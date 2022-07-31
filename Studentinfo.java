import java.util.*;
public class Studentinfo 
{
    public static void main(String args[])
    {

        System.out.println("Enter the id ,name and per of student");
        Scanner sc=new Scanner(System.in);
        int id=sc.nextInt();
        String name=sc.next();               //if u write this above all input then u have to write
        float per=sc.nextFloat();               //String name=sc.nextLine(); 
                                               
        System.out.println(+id+"\n"+name+"\n"+per);

    }
    
}

